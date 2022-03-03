package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesign = List.of("Wildenei", "Robson", "Silvana");
        List<String> developers = List.of("Willame", "Carlos Santana", "Reginaldo");
        List<String> alunos = List.of("Guilherme", "Diego", "Miguel");
        devDojo.add(graphicDesign);
        devDojo.add(developers);
        devDojo.add(alunos);

        for (List<String> people : devDojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("----------------");

        devDojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

    }
}
