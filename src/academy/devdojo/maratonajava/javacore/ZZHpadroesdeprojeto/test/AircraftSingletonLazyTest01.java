package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSigletonLazy;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) {
        bookSet("1A");
        bookSet("1A");
    }

    private static void bookSet(String seat){
        System.out.println(AircraftSigletonLazy.getINSTANCE());
        AircraftSigletonLazy aircraftSigletonLazy = AircraftSigletonLazy.getINSTANCE();
        System.out.println(aircraftSigletonLazy.bookSeat(seat));
    }
}
