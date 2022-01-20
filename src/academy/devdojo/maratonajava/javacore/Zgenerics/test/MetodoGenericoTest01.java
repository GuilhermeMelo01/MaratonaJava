package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.Comparator;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComObjeto(new Carro("BMW"));

    }

    private static <T> List<T>  criarArrayComObjeto(T t){
       return List.of(t);
    }

//    private static <T extends Comparable> List<T>  criarArrayComObjeto(T t){
//        return List.of(t);
//    }
}


