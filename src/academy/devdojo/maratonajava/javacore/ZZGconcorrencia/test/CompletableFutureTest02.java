package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPriceAsyncCompletableFuture(storeService);

    }

    private static void searchPriceAsyncCompletableFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        List<String> store = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<Double>> completableFuture = store.stream()
                .map(storeService::getPriceAsyncCompletableFuture).toList();

        List<Double> prices = completableFuture.stream().map(CompletableFuture::join).collect(Collectors.toList());

        System.out.println(prices);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d%n", (end - start));
        StoreService.shutdown();
    }

}
