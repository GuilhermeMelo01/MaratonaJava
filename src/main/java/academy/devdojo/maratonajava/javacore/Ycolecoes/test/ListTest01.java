package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("William");
        nomes.add("DEVDOJO");
        nomes2.add("Suane");
        nomes2.add("Academy");

        nomes.addAll(nomes2);
        for(String nome: nomes){
            System.out.println(nome);
        }
        System.out.println("-------------");

        nomes.add("Guilherme");
        nomes.add("Suane");

        for(int i=0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        System.out.println("----------------");
        List<Integer> numbers = new ArrayList<>(10);
        numbers.add(29);
        numbers.add(12);

        for (Integer numeros: numbers){
            System.out.println(numeros);
        }

    }
}
