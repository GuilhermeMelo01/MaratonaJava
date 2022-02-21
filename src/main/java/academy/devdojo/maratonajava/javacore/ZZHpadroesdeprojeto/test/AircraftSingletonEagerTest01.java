package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Aircraft;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSigletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSet("1A");
        bookSet("1A");
    }

    private static void bookSet(String seat){
        System.out.println(AircraftSigletonEager.getINSTANCE());
        AircraftSigletonEager aircraftSigletonEager = AircraftSigletonEager.getINSTANCE();
        System.out.println(aircraftSigletonEager.bookSeat(seat));
    }
}
