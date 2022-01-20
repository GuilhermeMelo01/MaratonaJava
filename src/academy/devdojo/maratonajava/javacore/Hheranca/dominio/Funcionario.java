package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static{
        System.out.println("Dentro do bloco de inicializacao Estatico de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicializacao de Funcionario 1 ");
    }
    {
        System.out.println("Dentro do bloco de inicializacao de Funcionario 2 ");
    }



    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro construtor de Funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioDeSalario() {
        System.out.println("Eu " + this.nome + " recebir o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
