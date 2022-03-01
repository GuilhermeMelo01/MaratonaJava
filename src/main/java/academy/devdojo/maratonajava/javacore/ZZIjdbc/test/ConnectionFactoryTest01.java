package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("MadHouse").build();
        Producer producerToUpdate = Producer.builder().id(6).name("leftSide").build();
//        ProducerRepository.save(producer);
//        ProducerService.delete(4);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers1 = ProducerService.findByName("left");
//        log.info("Producers name found '{}'", producers);
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndToUpperCase("Mad");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 Pictures");
//        log.info("Producers name found '{}'", producers);
//          ProducerService.findByNameAndDelete("A-1 Pictures");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("ONE1");
//        log.info("Producers name found '{}'", producers);
//            ProducerService.updatePreparedStatement(producerToUpdate);

        List<Producer> producers = ProducerService.findByNameCallableStatement("MAD");
        log.info("Producers name found '{}'", producers);
    }
}
