package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Goku";
        estudante1.sexo = 'M';
        estudante1.idade = 28;

        estudante1.imprime();

        estudante2.nome = "Nami";
        estudante2.sexo = 'F';
        estudante2.idade = 19;

        estudante2.imprime();
    }
}

