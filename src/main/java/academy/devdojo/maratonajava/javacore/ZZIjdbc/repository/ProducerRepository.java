package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer){
        String sql;
        sql = "INSERT INTO producer (name) values ('%s')".formatted(producer.getName());
        try(Connection conn = ConnectionFactory.getConnection()){
            Statement stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Insert producer in the database, rows affected '{}'", rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
