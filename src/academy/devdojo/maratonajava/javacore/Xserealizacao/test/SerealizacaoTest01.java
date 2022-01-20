package academy.devdojo.maratonajava.javacore.Xserealizacao.test;

import academy.devdojo.maratonajava.javacore.Xserealizacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserealizacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerealizacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Luffy", "1415131414");
        Turma turma = new Turma("Alunos do DevDojo");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
            System.out.println("Serealizacao feita com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream ois= new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
            System.out.println("Deserealizacao feita com sucesso!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
