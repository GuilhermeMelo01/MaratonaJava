package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("MadHouse").build();
        Producer producerToUpdate = Producer.builder().id(6).name("LEFTSIDE").build();
//        ProducerRepository.save(producer);
//        ProducerService.delete(4);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers1 = ProducerService.findByName("left");
//        log.info("Producers name found '{}'", producers);
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
        List<Producer> producers = ProducerService.findByNameAndToUpperCase("Mad");
        log.info("Producers name found '{}'", producers);
    }
}
