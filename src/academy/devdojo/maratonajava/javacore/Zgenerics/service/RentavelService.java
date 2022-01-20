package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentavelService<T>{
    private List<T> objetosDisponiveis;

    public RentavelService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objetos disponivel...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando o objeto: "+ t);
        System.out.println("objetos disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo Carro: "+ t);
        objetosDisponiveis.add(t);
        System.out.println("objetos disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
    }

}
