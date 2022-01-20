package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParamentroTest03 {
    private static List<Car> cars = List.of(new Car("green", 2010), new Car("red", 1998), new Car("Yellow", 2018));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars,car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars,car -> car.getColor().equals("red"));
        List<Car> yearCar = filter(cars,car -> car.getYear() < 2015);

        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearCar);

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums, num -> num % 2 == 0));

    }
   private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filterList = new ArrayList<>();
        for (T e : list){
            if (predicate.test(e)){
                filterList.add(e);
            }
        }
        return filterList;
    }


}
