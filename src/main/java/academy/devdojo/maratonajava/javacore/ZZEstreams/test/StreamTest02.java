package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightMovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<LightMovel> listMovel = new ArrayList<>(List.of(new LightMovel("One Piece", 9.43),
            new LightMovel("Naruto", 5.76),
            new LightMovel("Berserk", 8.65),
            new LightMovel("Boku no Hero", 3.54),
            new LightMovel("OverLord", 2.87),
            new LightMovel("Nanatsu no Tanzai", 6.65),
            new LightMovel("Dragon Cavern", 4.00)));

    public static void main(String[] args) {
        List<String> listTitle = listMovel.stream()
                .sorted(Comparator.comparing(LightMovel::getNome))
                .filter(lm -> lm.getPreço() <= 4)
                .limit(3)
                .map(LightMovel::getNome).toList();

        System.out.println(listTitle);
    }
}
