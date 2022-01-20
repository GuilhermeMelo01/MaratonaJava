package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
    List<String> strings = List.of("Guilherme0", "Luffy", "Zoro");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        forEarch(strings, syst -> System.out.println(syst));
        forEarch(integers, inte -> System.out.println(inte));

    }

    private static <T> void forEarch(List<T> list, Consumer<T> consumer) {
        for (T e: list){
            consumer.accept(e);
        }
    }

}
