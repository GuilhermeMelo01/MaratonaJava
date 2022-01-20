package academy.devdojo.maratonajava.javacore.Csobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", "Pirata", 1000, "Açao");
       // anime.init("One Piece", "Pirata", 1000, "Açao");
        anime.imprime();



    }
}
