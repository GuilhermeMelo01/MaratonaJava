package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemove {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando os dados do DataLoader...");
    }

    public static void retrieveMaxSize(){
        System.out.println("Dentro do retrieveMaxSize...DATABASE");
    }
}
