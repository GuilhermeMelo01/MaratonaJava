package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparator> animeComparatorSupplier = AnimeComparator::new;
        AnimeComparator animeComparator = animeComparatorSupplier.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One piece", 129), new Anime("Berserk", 12), new Anime("Naruto", 100)));

        animeList.sort(animeComparator::compareByEpisodesNonStatic);
        System.out.println(animeList);


        BiFunction<String, Integer, Anime> biAnimeFuction = (title, episodes) -> new Anime(title,episodes);
        BiFunction<String, Integer, Anime> biAnimeFuction2 = Anime::new;
        System.out.println(biAnimeFuction2.apply("Akamura", 182));
        System.out.println(animeList);

    }
}
