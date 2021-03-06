package academy.devdojo.maratonajava.javacore.ZZEstreams.ZZJcrud.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int op;

        while(true){
            producerMenu();
            op = Integer.parseInt(SCANNER.nextLine());
            if (op == 0) break;
            ProducerService.menu(op);
        }
    }

    private static void producerMenu(){
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for producers");
        System.out.println("2. delete the producer");
        System.out.println("0. Exit");
    }
}
