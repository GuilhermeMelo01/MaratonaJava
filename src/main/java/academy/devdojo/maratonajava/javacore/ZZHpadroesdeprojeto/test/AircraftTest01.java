package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Aircraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSet("1A");
        bookSet("1A");
    }

    private static void bookSet(String seat){
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));
    }
}
