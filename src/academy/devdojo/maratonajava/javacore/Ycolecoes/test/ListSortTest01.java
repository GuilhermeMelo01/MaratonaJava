package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class ListSortTest01 {
    public static void main(String[] args) {

        List<String> mangas = new ArrayList<>(6);
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Attack on Titan");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas);

        for (String mng: mangas){
            System.out.println(mng);
        }

        List<Double> dinheiros = new ArrayList(10);

        dinheiros.add(110.89);
        dinheiros.add(40.32);
        dinheiros.add(52.90);
        dinheiros.add(13.20);

        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);


    }
}
