package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("LizweEIN9", 3000);
        Tomate tomate = new Tomate("Americano", 30);
        tomate.setDataDeValidade("10/10/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
