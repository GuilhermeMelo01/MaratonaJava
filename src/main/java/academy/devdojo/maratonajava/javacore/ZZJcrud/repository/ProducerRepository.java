package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;


import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {

    public static List<Producer> findByName(String name) {
        log.info("find producers by name '{}'", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producer ", e);
        }
        return producers;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "select * from producer where name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement ps = createPreparedStatementDelete(conn, id);
            ps.execute();
            log.info("Delete producer '{}' in the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM producer WHERE (id = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Producer producer) {
        log.info("Saving producer '{}'", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementSave(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO producer (name) values (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

    public static Optional<Producer> findById(Integer id) {
        log.info("find producers by id '{}'", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();
            return Optional.of(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
        } catch (SQLException e) {
            log.error("Error while trying to find all producer ", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPreparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "select * from producer where id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void update(Producer producer) {
        log.info("Updating producer '{}'", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementUpdate(conn, producer)){
             ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Producer producer)
            throws SQLException {
        String sql = "UPDATE `producer` SET `name` = ? WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }

}
