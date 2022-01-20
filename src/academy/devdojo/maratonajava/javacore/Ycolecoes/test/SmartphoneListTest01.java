package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iphone");
        Smartphone s2 = new Smartphone("22222", "pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);

        for (Smartphone smart: smartphones){
            System.out.println(smart.toString());
        }

        Smartphone s4 = new Smartphone("22222333", "pixel");
        if (smartphones.indexOf(s4) != -1){
            System.out.println("Esse smartphone ja existe!");
        } else {
            smartphones.add(s4);
            System.out.println("Smartphone adicionado!");
        }

        for (Smartphone smart: smartphones){
            System.out.println(smart.toString());
        }
    }
}
