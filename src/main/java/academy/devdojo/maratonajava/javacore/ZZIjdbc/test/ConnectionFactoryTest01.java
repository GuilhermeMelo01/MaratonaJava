package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("MadHouse").build();
        Producer producerToUpdate = Producer.builder().id(6).name("LEFTSIDE").build();
        //  ProducerRepository.save(producer);
        //  ProducerService.delete(4);
//            ProducerService.update(producerToUpdate);
        List<Producer> producers = ProducerService.findAll();
        log.info("Producers found '{}'", producers);
    }
}
