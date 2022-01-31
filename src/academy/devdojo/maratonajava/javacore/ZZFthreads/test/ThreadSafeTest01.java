package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import javax.print.attribute.standard.RequestingUserName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames{
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());


    public synchronized void add(String name){
        names.add(name);
    }

    public synchronized void removeFirst(){
        if (names.size() > 0){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }



}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Joaquim");
        Runnable r = threadSafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();

    }
}
