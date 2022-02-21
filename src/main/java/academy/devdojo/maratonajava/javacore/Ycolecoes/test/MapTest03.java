package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(5L, "Berserk", 19.9);
        Manga manga2 = new Manga(4L, "Pokemon", 12.1);
        Manga manga3 = new Manga(22L, "Dragon Ball Z", 20.10);
        Manga manga4 = new Manga(12L, "Attack On Titan", 7);
        Manga manga5 = new Manga(7L, "Hellsing Ultimate", 15.50);

        List<Manga> mangaConsumidorList1 = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidorList2 = List.of(manga5, manga4);
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, mangaConsumidorList1 );
        consumidorManga.put(consumidor2, mangaConsumidorList2);

        for (Map.Entry<Consumidor, List<Manga>> entryManga : consumidorManga.entrySet()){
            System.out.println("( " + entryManga.getKey().getNome()+" ) ");
            for (Manga manga : entryManga.getValue()) {
                System.out.println("--- "+manga.getNome());
            }

        }



    }
}