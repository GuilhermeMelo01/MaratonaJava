package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
// 0- bloco de inicializacao Estatico da super calsse é executado quando a JVM carregar a classe pai
// 1- bloco de inicializacao Estatico da sub calsse é executado quando a JVM carregar a classe filha
// 2- Alocado espaço em memoria para o objeto da superclasse
// 3- Cada atributo de classe é criado e inicializado com valores default ou o quer que for passado na superclasse
// 4- Bloco de inicializacao da superclasse é executado na ordem em que aparece
// 5- Construtor da superclasse é executado

// 6- Alocado espaço em memoria para o objeto da subclasse
// 7- Cada atributo de classe é criado e inicializado com valores default ou o quer que for passado na subclasse
// 8- Bloco de inicializacao da subclasse é executado na ordem em que aparece
// 9- Construtor da subclasse é executado


public class HerancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jyraia");
    }
}
