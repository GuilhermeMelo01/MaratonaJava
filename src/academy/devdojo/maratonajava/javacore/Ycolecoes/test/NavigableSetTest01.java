package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
class MangasPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangasPrecoComparator());
        mangas.add(new Manga(5L, "Berserk", 19.9, 0));
        mangas.add(new Manga(4L, "Pokemon", 12.1, 2));
        mangas.add(new Manga(1L, "Dragon Ball Z", 20.10, 0));
        mangas.add(new Manga(2L, "Attack On Titan", 7, 0));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 15.50, 6));
        mangas.add(new Manga(8L, "Aaragon", 13.50, 6));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        //lower <
        //floor <=
        //higher >
        //ceiling >=

        Manga yuyu = new Manga(21L, "yu yu Hakuso", 12.1, 0);
        System.out.println("--------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());


    }
}
