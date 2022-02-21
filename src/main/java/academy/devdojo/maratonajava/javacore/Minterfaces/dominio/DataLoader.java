package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {

    public static final int MAX_SIZE = 10;
    void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissoes..");
    }

    public static void retrieveMaxSize(){
        System.out.println("Dentro do retrieveMaxSize...");
    }

}
