package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentavelService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lacha"), new Barco("Canoa")));
        RentavelService<Barco> rentavelService = new RentavelService<>(barcosDisponiveis);

        Barco barco = rentavelService.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mes....");
        rentavelService.retornarObjetoAlugado(barco);

        System.out.println("---------");

        RentavelService<Carro> rentavelService1 = new RentavelService<>(carrosDisponiveis);
        Carro carro = rentavelService1.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mes....");
        rentavelService1.retornarObjetoAlugado(carro);

    }
}
