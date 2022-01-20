package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightMovel;
import java.util.*;

//1. Order LightMovel by title
//2. Retrieve the first 3 titles Light Movel with price less than 4
public class StreamsTest01 {
    private static List<LightMovel> listMovel = new ArrayList<>(List.of(new LightMovel("One Piece", 9.43),
            new LightMovel("Naruto", 5.76),
            new LightMovel("Berserk", 8.65),
            new LightMovel("Boku no Hero", 3.54),
            new LightMovel("OverLord", 2.87),
            new LightMovel("Nanatsu no Tanzai", 6.65),
            new LightMovel("Dragon Cavern", 4.00)));

    public static void main(String[] args) {

        listMovel.sort(Comparator.comparing(LightMovel::getNome));
        List<String> titles = new ArrayList<>();
        for (LightMovel lightMovel : listMovel) {
            if (lightMovel.getPreço() <= 4){
                titles.add(lightMovel.getNome());
            }
            if (titles.size() >= 3){
                break;
            }

        }

        System.out.println(listMovel);
        System.out.println("-------");
        System.out.println(titles);






    }
}
