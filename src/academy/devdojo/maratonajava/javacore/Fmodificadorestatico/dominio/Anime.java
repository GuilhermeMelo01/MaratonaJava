package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int [] episodios;
    // 0- bloco de inicializacao é executado quando a JVM carregar a classe
    // 1- Alocado espaço em memoria para o objeto
    // 2- Cada atributo de classe é criado e inicializado com valores default ou o quer que for passado
    // 3- Bloco de inicializacao é executado
    // 4- Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao 2");
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        for (int episodios: Anime.episodios){
            System.out.print(episodios +" ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
