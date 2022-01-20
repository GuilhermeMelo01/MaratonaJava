package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

//Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> nomeLista = new ArrayList<>(List.of("Luffy", "Zoro", "Sanji"));
        nomeLista.sort(String::compareTo);
        System.out.println(nomeLista);

        Function<String, Integer> numStringToIntenger = Integer::parseInt;
        Integer apply = numStringToIntenger.apply("10");
        System.out.println(apply);

        BiPredicate<List<String>, String> vrfList = List::contains;
        System.out.println(vrfList.test(nomeLista, "Ramaru"));
    }
}
