package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Gohan");
        funcionario.setIdade(18);
        funcionario.setSalarios(new double[] {1279, 1443, 8327});

        funcionario.imprime();
        System.out.println("media: " +funcionario.getMedia());
    }
}
