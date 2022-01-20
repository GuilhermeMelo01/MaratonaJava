
package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightMovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

public class StreamTest15 {
    private static final List<LightMovel> lightMovel = new ArrayList<>(List.of(new LightMovel("One Piece", 6.43, Category.FANTASY),
            new LightMovel("Naruto", 5.76, Category.FANTASY),
            new LightMovel("Berserk", 8.65, Category.FANTASY),
            new LightMovel("Boku no Hero", 3.54, Category.FANTASY),
            new LightMovel("OverLord", 2.87, Category.ROMANCE),
            new LightMovel("Nanatsu no Tanzai", 1.65, Category.DRAMA),
            new LightMovel("Nanatsu no Tanzai", 1.65, Category.DRAMA),
            new LightMovel("Dragon Cavern", 4.00, Category.FANTASY)));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightMovel.stream()
                .collect(groupingBy(LightMovel::getCategory, Collectors.summarizingDouble(LightMovel::getPreço)));
        System.out.println(collect);

        System.out.println("---------");

        Map<Category, Set<Promotion>> collect1 = lightMovel.stream()
                .collect(groupingBy(LightMovel::getCategory, mapping(StreamTest15::getPromotion, Collectors.toSet())));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightMovel.stream()
                .collect(groupingBy(LightMovel::getCategory, mapping(StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect2);


    }
    private static Promotion getPromotion(LightMovel lm) {
        return lm.getPreço() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }

}
