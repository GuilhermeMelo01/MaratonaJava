package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightMovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {

    private static List<LightMovel> lightMovel = new ArrayList<>(List.of(new LightMovel("One Piece", 6.43),
        new LightMovel("Naruto", 5.76),
        new LightMovel("Berserk", 8.65),
        new LightMovel("Boku no Hero", 3.54),
        new LightMovel("OverLord", 2.87),
        new LightMovel("Nanatsu no Tanzai", 1.65),
        new LightMovel("Nanatsu no Tanzai", 1.65),
        new LightMovel("Dragon Cavern", 4.00)));

    public static void main(String[] args) {
        System.out.println(lightMovel.stream().anyMatch(ln -> ln.getPreço() > 8));
        System.out.println(lightMovel.stream().allMatch(ln -> ln.getPreço() > 0));
        System.out.println(lightMovel.stream().noneMatch(ln -> ln.getPreço() > 0));

        lightMovel.stream()
                .filter(ln -> ln.getPreço() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightMovel.stream()
                .filter(ln -> ln.getPreço() > 5)
                .sorted(Comparator.comparing(LightMovel::getPreço))
                .findFirst()
                .ifPresent(System.out::println);

        lightMovel.stream()
                .filter(ln -> ln.getPreço() > 5).min(Comparator.comparing(LightMovel::getPreço))
                .ifPresent(System.out::println);

    }
}
