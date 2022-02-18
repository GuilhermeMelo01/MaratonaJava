package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class WildcardTest02{
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
        printConsultaAnimals(cachorros);
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cachorro());
        printConsultaAnimals(animals);
    }

    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
    private static void printConsultaAnimals(List<? super Cachorro> cachorros) {
        for (Object o : cachorros) {
            if (o instanceof Cachorro){
                ((Cachorro) o).consulta();
            }
        }
    }
}
