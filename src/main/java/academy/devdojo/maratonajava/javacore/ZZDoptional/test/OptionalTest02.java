package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalTest02 {
    public static void main(String[] args) throws Exception {
        Optional<Manga> one_piece = MangaRepository.findByTitle("One Piece");
        one_piece.ifPresent(m -> m.setTitle("DBZ"));
        System.out.println(one_piece);

        Manga mangaById = MangaRepository.findById(2).orElseThrow();
        System.out.println(mangaById);

        Manga mangaCreate = MangaRepository.findByTitle("Berserk")
                .orElse(new Manga(5, "Berserk", 30));
        System.out.println(mangaCreate);

        Manga mangaCreate2 = MangaRepository.findByTitle("Pokemom")
                .orElseGet(() -> new Manga(18, "Pokemom", 376));
        System.out.println(mangaCreate2);


    }
}
