package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParamentroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2010), new Car("red", 1998), new Car("Yellow", 2018));

    public static void main(String[] args) {
        System.out.println(filterCarByGreen(cars));
        System.out.println(filterCarByRed(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("-----------------");
        System.out.println(filterCarByYear(cars, 2011));

    }

    private static List<Car> filterCarByGreen(List<Car> car) {
        List<Car> colorCar = new ArrayList<>();
        for (Car car1 : car) {
            if (car1.getColor().equals("green")) {
                colorCar.add(car1);
            }
        }
        return colorCar;
    }

    private static List<Car> filterCarByRed(List<Car> car) {
        List<Car> colorCar = new ArrayList<>();
        for (Car car1 : car) {
            if (car1.getColor().equals("red")) {
                colorCar.add(car1);
            }
        }
        return colorCar;
    }

    private static List<Car> filterCarByColor(List<Car> car, String color) {
        List<Car> colorCar = new ArrayList<>();
        for (Car car1 : car) {
            if (car1.getColor().equals(color)) {
                colorCar.add(car1);
            }
        }
        return colorCar;
    }

    private static List<Car> filterCarByYear(List<Car> car, int year) {
        List<Car> yearCar = new ArrayList<>();
        for (Car car1 : car) {
            if (car1.getYear() < year) {
                yearCar.add(car1);
            }
        }
        return yearCar;
    }
}
