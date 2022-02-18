
package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightMovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
    private static final List<LightMovel> lightMovel = new ArrayList<>(List.of(new LightMovel("One Piece", 6.43, Category.FANTASY),
            new LightMovel("Naruto", 5.76, Category.FANTASY),
            new LightMovel("Berserk", 8.65, Category.FANTASY),
            new LightMovel("Boku no Hero", 3.54, Category.FANTASY),
            new LightMovel("OverLord", 2.87, Category.ROMANCE),
            new LightMovel("Nanatsu no Tanzai", 1.65, Category.DRAMA),
            new LightMovel("Nanatsu no Tanzai", 1.65, Category.DRAMA),
            new LightMovel("Dragon Cavern", 4.00, Category.FANTASY)));

    public static void main(String[] args) {

        Map<Category, Long> collect = lightMovel.stream().collect(groupingBy(LightMovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightMovel>> collect1 = lightMovel.stream().collect(
                groupingBy(LightMovel::getCategory,
                        Collectors.maxBy(Comparator.comparing(LightMovel::getPreço))));
        System.out.println(collect1);

        //PARA REMOVER O OPTIONAL
        Map<Category, LightMovel> collect2 = lightMovel.stream().collect(groupingBy(LightMovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightMovel::getPreço)), Optional::get)));
        System.out.println(collect2);

        System.out.println("------------------");

        Map<Category, LightMovel> collect3 = lightMovel.stream().collect(Collectors.toMap(LightMovel::getCategory,
                Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightMovel::getPreço))));
        System.out.println(collect3);


    }
}
