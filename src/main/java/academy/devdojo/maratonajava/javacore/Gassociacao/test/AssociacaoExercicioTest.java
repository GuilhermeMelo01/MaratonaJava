package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Seminario;

import java.awt.image.BaseMultiResolutionImage;

public class AssociacaoExercicioTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das lamentações");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno alunosParaSeminario[] = {aluno};

        Seminario seminario = new Seminario("Onde achar o one piece", alunosParaSeminario, local);

        Seminario [] seminarioDisponivel = {seminario};

        professor.setSeminarios(seminarioDisponivel);

        professor.imprime();

    }
}
