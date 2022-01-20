package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One piece", 129), new Anime("Berserk", 12), new Anime("Naruto", 100)));
       // Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        Collections.sort(animeList, AnimeComparator::compareByTitle);
        System.out.println(animeList);
        Collections.sort(animeList, AnimeComparator::compareByEpisodes);
        System.out.println(animeList);


    }
}
