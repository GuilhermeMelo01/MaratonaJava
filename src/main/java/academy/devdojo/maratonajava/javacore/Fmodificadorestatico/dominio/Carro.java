package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private Double velocidadeMaxima;
    private static Double velocidadeLimite = 250d;

    public Carro(String nome, Double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("--------------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Velocidade Maxima: "+ this.velocidadeMaxima);
        System.out.println("Velocidade Limite: "+ this.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
