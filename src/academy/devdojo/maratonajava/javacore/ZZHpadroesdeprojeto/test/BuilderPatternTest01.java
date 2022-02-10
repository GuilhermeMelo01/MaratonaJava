package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person person1 = Person.PersonBuilder
                .builder()
                .firstName("Guilherme")
                .lastName("Melo")
                .username("Whiz")
                .email("JoaoZinho@gmail.academy")
                .build();
        System.out.println(person1);
    }
}
