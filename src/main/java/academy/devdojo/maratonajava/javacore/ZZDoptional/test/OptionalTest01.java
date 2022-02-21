package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha fodase");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-------------------");

        Optional<String> optionalTest = findName("William");
        String empty = optionalTest.orElse("EMPTY");
        System.out.println(empty);
        optionalTest.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name){
        List<String> lista = List.of("William", "DevDojo");
        int index = lista.indexOf(name);
        if (index != -1){
            return Optional.of(lista.get(index));
        }
        return Optional.empty();
    }

}
