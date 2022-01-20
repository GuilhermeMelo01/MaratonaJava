package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangasPrecoComparator().reversed());
        mangas.add(new Manga(5L, "Berserk", 19.9, 0));
        mangas.add(new Manga(4L, "Pokemon", 12.1, 2));
        mangas.add(new Manga(1L, "Dragon Ball Z", 20.10, 0));
        mangas.add(new Manga(2L, "Attack On Titan", 7, 0));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 15.50, 6));
        mangas.add(new Manga(8L, "Aaragon", 13.50, 6));
        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
