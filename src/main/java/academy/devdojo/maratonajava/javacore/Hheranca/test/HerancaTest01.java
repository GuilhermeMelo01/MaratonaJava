package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Tusyoha Komai");
        pessoa.setCpf("06317098352");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Hayaxi Tushinoda");
        funcionario.setCpf("874329472");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1999);
        funcionario.imprime();
        funcionario.relatorioDeSalario();


    }
}
