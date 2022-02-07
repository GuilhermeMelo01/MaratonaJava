package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceDreprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
       StoreServiceDreprecated storeServiceDreprecated = new StoreServiceDreprecated();
        searchPriceAsyncCompletableFuture(storeServiceDreprecated);

    }

    private static void searchPriceAsyncCompletableFuture(StoreServiceDreprecated storeServiceDreprecated){
        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });

        List<String> store = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<Double>> completableFuture = store.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeServiceDreprecated.getPriceSync(s), executor)).toList();

        List<Double> prices = completableFuture.stream().map(CompletableFuture::join).toList();


        System.out.println(prices);
        long end = System.currentTimeMillis();
        executor.shutdown();
        System.out.printf("Time passed to searchPriceSync %d%n", (end - start));
    }

}
