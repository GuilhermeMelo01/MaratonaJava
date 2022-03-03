package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Jiraya");
        Professor prof2 = new Professor("Solange");
        Professor[] professores = {prof1, prof2};
        Escola escola = new Escola("Branca Carneiro De Mendonça", professores);

        escola.imprime();

    }

}
