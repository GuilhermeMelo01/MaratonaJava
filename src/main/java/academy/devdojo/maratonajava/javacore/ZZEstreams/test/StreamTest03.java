package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightMovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightMovel> listMovel = new ArrayList<>(List.of(new LightMovel("One Piece", 9.43),
            new LightMovel("Naruto", 5.76),
            new LightMovel("Berserk", 8.65),
            new LightMovel("Boku no Hero", 3.54),
            new LightMovel("OverLord", 2.87),
            new LightMovel("Nanatsu no Tanzai", 1.65),
            new LightMovel("Nanatsu no Tanzai", 1.65),
            new LightMovel("Dragon Cavern", 4.00)));

    public static void main(String[] args) {
        Stream<LightMovel> stream = listMovel.stream();
        listMovel.forEach(System.out::println);
        long count = stream.filter(ln -> ln.getPreço() <= 4).count();
        System.out.println(count);

        long count2 =listMovel.stream().distinct().filter(ln -> ln.getPreço() <= 4).count();
        System.out.println(count2);
    }
}
