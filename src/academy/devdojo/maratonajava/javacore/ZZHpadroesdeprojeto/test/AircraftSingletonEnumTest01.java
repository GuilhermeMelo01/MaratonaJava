package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSigletonLazy;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSet("1A");
        bookSet("1A");
    }

    private static void bookSet(String seat){
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum aircraftSingletonEnum = AircraftSingletonEnum.INSTANCE;
        System.out.println(aircraftSingletonEnum.bookSeat(seat));
    }
}

