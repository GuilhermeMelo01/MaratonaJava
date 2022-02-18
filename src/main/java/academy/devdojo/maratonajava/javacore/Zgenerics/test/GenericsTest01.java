package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> anime = new ArrayList<>(10);
        anime.add("HxH");
        anime.add("One Piece");
        anime.add("Berserk");
        for (String animes: anime){
            System.out.println(animes);
        }
    }
}
