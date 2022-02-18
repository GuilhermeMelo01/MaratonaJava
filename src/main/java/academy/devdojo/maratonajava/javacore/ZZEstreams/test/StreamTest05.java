package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "no", "mi");
        List<String> letters = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream).toList();
        System.out.println(letters);

        List<String> string = List.of("kamehameha");
        List<String> strings = string.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream).toList();
        System.out.println(strings);
    }
}
