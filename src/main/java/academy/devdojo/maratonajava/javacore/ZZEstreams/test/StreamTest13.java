
package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightMovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static final List<LightMovel> lightMovel = new ArrayList<>(List.of(new LightMovel("One Piece", 6.43, Category.FANTASY),
            new LightMovel("Naruto", 5.76, Category.FANTASY),
            new LightMovel("Berserk", 8.65, Category.FANTASY),
            new LightMovel("Boku no Hero", 3.54, Category.FANTASY),
            new LightMovel("OverLord", 2.87, Category.ROMANCE),
            new LightMovel("Nanatsu no Tanzai", 1.65, Category.DRAMA),
            new LightMovel("Nanatsu no Tanzai", 1.65, Category.DRAMA),
            new LightMovel("Dragon Cavern", 4.00, Category.FANTASY)));

    public static void main(String[] args) {

        Map<Promotion, List<LightMovel>> collect = lightMovel.stream().collect(Collectors.groupingBy(StreamTest13::getPromotion));
        System.out.println(collect);

        System.out.println("--------------------");
        //Map<Category, Map<Promotion, List<LightMovel>>>
        Map<Category, Map<Promotion, List<LightMovel>>> collect1;
        collect1 = lightMovel.stream().collect(Collectors.groupingBy(LightMovel::getCategory,
                Collectors.groupingBy(StreamTest13::getPromotion)));

        System.out.println(collect1);
    }

    private static Promotion getPromotion(LightMovel lm) {
        return lm.getPreço() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
