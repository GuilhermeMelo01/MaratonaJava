package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class CopyOnWriteArrayListTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 2000; i++) {
            numeros.add(i);
        }

        Runnable runnableIterator = () ->{
            Iterator<Integer> iterator = numeros.iterator();
            try {
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnableRemove = () ->{
            for (int i = 0; i < 500; i++) {
                System.out.printf("%s removed %d%n", Thread.currentThread().getName(), i);
            }
        };

        new Thread(runnableIterator).start();
        new Thread(runnableIterator).start();
        new Thread(runnableRemove).start();

    }
}
