package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One piece", 129), new Anime("Berserk", 12), new Anime("Naruto", 100)));
        animeList.sort(animeComparator::compareByEpisodesNonStatic);
        System.out.println(animeList);

    }
}
