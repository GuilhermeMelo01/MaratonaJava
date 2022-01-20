package academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    //ANONIMAS, FUNCOES, CONSISO
    boolean test(Car car);
    //(Paramentro) -> <expressão>;   <| LAMBDA
    //(Car car) -> car.getColor().equals("green");

}
