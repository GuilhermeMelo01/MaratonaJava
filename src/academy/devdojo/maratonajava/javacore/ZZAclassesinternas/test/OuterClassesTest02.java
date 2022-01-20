package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Midorya";

    public void print(){
        final String lastName = "Mikuya";
        class LocalClass{
            public void printLocalClass(){
                System.out.println(name+" "+ lastName);
            }
        }
        new LocalClass().printLocalClass();

    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();

    }
}
