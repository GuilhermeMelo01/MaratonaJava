package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando Carro disponivel...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando o Carro: "+ carro);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro Carro){
        System.out.println("Devolvendo Carro: "+ Carro);
        carrosDisponiveis.add(Carro);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(carrosDisponiveis);
    }

}
