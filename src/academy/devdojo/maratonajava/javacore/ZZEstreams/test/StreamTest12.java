package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightMovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightMovel> lightMovel = new ArrayList<>(List.of(new LightMovel("One Piece", 6.43, Category.FANTASY),
            new LightMovel("Naruto", 5.76, Category.FANTASY),
            new LightMovel("Berserk", 8.65, Category.FANTASY),
            new LightMovel("Boku no Hero", 3.54, Category.FANTASY),
            new LightMovel("OverLord", 2.87, Category.ROMANCE),
            new LightMovel("Nanatsu no Tanzai", 1.65, Category.DRAMA),
            new LightMovel("Nanatsu no Tanzai", 1.65, Category.DRAMA),
            new LightMovel("Dragon Cavern", 4.00, Category.FANTASY)));

    public static void main(String[] args) {
//        Map<Category, List<LightMovel>> categoryLigthMovelMap = new HashMap<>();
//        List<LightMovel> fantasy = new ArrayList<>();
//        List<LightMovel> romance = new ArrayList<>();
//        List<LightMovel> drama = new ArrayList<>();
//        for (LightMovel ligthNovel : lightMovel) {
//            switch (ligthNovel.getCategory()) {
//                case FANTASY:
//                    fantasy.add(ligthNovel);
//                    break;
//                case ROMANCE:
//                    romance.add(ligthNovel);
//                    break;
//                case DRAMA:
//                    drama.add(ligthNovel);
//                    break;
//            }
//        }
//        categoryLigthMovelMap.put(Category.DRAMA, drama);
//        categoryLigthMovelMap.put(Category.FANTASY, fantasy);
//        categoryLigthMovelMap.put(Category.ROMANCE, romance);
//        System.out.println(categoryLigthMovelMap);

        Map<Category, List<LightMovel>> collect = lightMovel.stream().collect(Collectors.groupingBy(LightMovel::getCategory));
        System.out.println(collect);
    }
}
