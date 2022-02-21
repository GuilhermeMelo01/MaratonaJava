package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Berserk", 19.9, 0));
        mangas.add(new Manga(4L, "Pokemon", 12.1, 2));
        mangas.add(new Manga(1L, "Dragon Ball Z", 20.10, 0));
        mangas.add(new Manga(2L, "Attack On Titan", 7, 0));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 15.50, 6));

        //FORMAS DE REMOVER UM OBJETO DE UMA LISTA
        mangas.removeIf(qtdManga -> qtdManga.getQuantidade() == 0 );
        System.out.println(mangas);

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if (manga.getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }
//        System.out.println(mangas);
    }
}
