package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightMovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightMovel> lightMovel = new ArrayList<>(List.of(new LightMovel("One Piece", 6.43),
            new LightMovel("Naruto", 5.76),
            new LightMovel("Berserk", 8.65),
            new LightMovel("Boku no Hero", 3.54),
            new LightMovel("OverLord", 2.87),
            new LightMovel("Nanatsu no Tanzai", 1.65),
            new LightMovel("Nanatsu no Tanzai", 1.65),
            new LightMovel("Dragon Cavern", 4.00)));

    public static void main(String[] args) {
        System.out.println(lightMovel.stream().count());
        System.out.println(lightMovel.stream().collect(Collectors.counting()));

        lightMovel.stream().max(Comparator.comparing(LightMovel::getPreço)).ifPresent(System.out::println);
        lightMovel.stream().collect(Collectors.maxBy(Comparator.comparing(LightMovel::getPreço))).ifPresent(System.out::println);

        System.out.println(lightMovel.stream().mapToDouble(LightMovel::getPreço).sum());
        System.out.println(lightMovel.stream().collect(Collectors.summingDouble(LightMovel::getPreço)));

        lightMovel.stream().mapToDouble(LightMovel::getPreço).average().ifPresent(System.out::println);
        System.out.println(lightMovel.stream().collect(Collectors.averagingDouble(LightMovel::getPreço)));

        DoubleSummaryStatistics collect = lightMovel.stream().collect(Collectors.summarizingDouble(LightMovel::getPreço));
        System.out.println(collect);

        String titles = lightMovel.stream().map(LightMovel::getNome).collect(Collectors.joining(", "));
        System.out.println(titles);


    }
}
