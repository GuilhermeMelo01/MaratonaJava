package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Berserk", 19.9));
        mangas.add(new Manga(4L, "Pokemon", 12.1));
        mangas.add(new Manga(22L, "Dragon Ball Z", 20.10));
        mangas.add(new Manga(12L, "Attack On Titan", 7));
        mangas.add(new Manga(7L, "Hellsing Ultimate", 15.50));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("------------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        mangas.sort(new MangaIdComparator());
        System.out.println("------------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
