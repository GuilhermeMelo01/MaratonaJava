package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L, "Berserk", 19.9, 0));
        mangas.add(new Manga(4L, "Pokemon", 12.1, 2));
        mangas.add(new Manga(1L, "Dragon Ball Z", 20.10, 0));
        mangas.add(new Manga(2L, "Attack On Titan", 7, 0));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 15.50, 6));


        for (Manga manga: mangas){
            System.out.println(manga);
        }

    }
}
