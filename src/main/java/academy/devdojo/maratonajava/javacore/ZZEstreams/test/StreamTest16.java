
package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumStreamParallelIterate(num);
        sumLongStream(num);
        sumParallelLongStream(num);
    }

    private static void sumFor(Long num) {
        System.out.println("SUM FOR");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(Long num) {
        System.out.println("SUM StreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");


    }

    private static void sumStreamParallelIterate(Long num) {
        System.out.println("SUM StreamParallelIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");

    }

    private static void sumLongStream(Long num) {
        System.out.println("SUM LongStream");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");


    }

    private static void sumParallelLongStream(Long num) {
        System.out.println("SUM ParallelLongStream");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

}
