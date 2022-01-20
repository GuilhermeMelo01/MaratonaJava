package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.awt.font.FontRenderContext;
import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(5L, "Berserk", 19.9);
        Manga manga2 = new Manga(4L, "Pokemon", 12.1);
        Manga manga3 = new Manga(22L, "Dragon Ball Z", 20.10);
        Manga manga4 = new Manga(12L, "Attack On Titan", 7);
        Manga manga5 = new Manga(7L, "Hellsing Ultimate", 15.50);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);
        for (Map.Entry<Consumidor, Manga> mangaEntry: consumidorManga.entrySet()){
            System.out.println(mangaEntry.getKey().getNome()+" - "+ mangaEntry.getValue().getNome());
        }


    }
}