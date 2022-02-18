package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParamentroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2010), new Car("red", 1998), new Car("Yellow", 2018));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars,car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars,car -> car.getColor().equals("red"));
        List<Car> yearCar = filter(cars,car -> car.getYear() < 2015);

        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearCar);
    }
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
           if (carPredicate.test(car)){
               filterCar.add(car);
           }
        }
        return filterCar;
    }


}
