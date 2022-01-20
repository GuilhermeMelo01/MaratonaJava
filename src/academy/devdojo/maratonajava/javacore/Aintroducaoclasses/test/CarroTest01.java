package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.nome = "celta";
        carro1.modelo = "Volksvagem";
        carro1.ano = 1350;

        Carro carro2 = new Carro();

        carro2.nome = "fusca";
        carro2.modelo = "toyota";
        carro2.ano = 1967;

        carro1 = carro2;

        System.out.println("Nome: "+carro1.nome+", Modelo: "+carro1.modelo+", Ano: "+ carro1.ano);
        System.out.println("Nome: "+carro2.nome+", Modelo: "+carro2.modelo+", Ano: "+ carro2.ano);

    }
}
