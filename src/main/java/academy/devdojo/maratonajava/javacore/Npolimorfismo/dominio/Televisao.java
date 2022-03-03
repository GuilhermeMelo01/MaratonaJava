package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    private static final double IMPOSTO_POR_CENTO = 0.13;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("--Calculando imposto televisao--");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
