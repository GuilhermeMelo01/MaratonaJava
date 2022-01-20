package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaIdComparator mangaIdComparator = new MangaIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Berserk", 19.9));
        mangas.add(new Manga(4L, "Pokemon", 12.1));
        mangas.add(new Manga(22L, "Dragon Ball Z", 20.10));
        mangas.add(new Manga(12L, "Attack On Titan", 7));
        mangas.add(new Manga(7L, "Hellsing Ultimate", 15.50));

        mangas.sort(mangaIdComparator);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(7L, "Hellsing Ultimate", 15.50);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaIdComparator));

    }
}
