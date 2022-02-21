package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightMovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightMovel> lightMovel = new ArrayList<>(List.of(new LightMovel("One Piece", 6.43),
        new LightMovel("Naruto", 5.76),
        new LightMovel("Berserk", 8.65),
        new LightMovel("Boku no Hero", 3.54),
        new LightMovel("OverLord", 2.87),
        new LightMovel("Nanatsu no Tanzai", 1.65),
        new LightMovel("Nanatsu no Tanzai", 1.65),
        new LightMovel("Dragon Cavern", 4.00)));

    public static void main(String[] args) {
          lightMovel.stream()
                  .map(LightMovel::getPreço)
                  .filter(preco -> preco > 3)
                  .reduce(Double::sum).ifPresent(System.out::println);

        double sum = lightMovel.stream()
                .mapToDouble(LightMovel::getPreço)
                .filter(preco -> preco > 3)
                .sum();

        System.out.println(sum);

    }
}
