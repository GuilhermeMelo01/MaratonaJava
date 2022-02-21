package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscount(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service){
        long start = System.currentTimeMillis();
        List<String> store = List.of("Store 1", "Store 2", "Store 3", "Store 4");
//        store.forEach(s -> System.out.println(service.getPriceSync(s)));
       store.stream()
                .map(service::getPriceSync)
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d%n", (end - start));
    }

    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service){
        long start = System.currentTimeMillis();
        List<String> store = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<String>> completableFuture = store.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .toList();

        completableFuture.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d%n", (end - start));
    }

}
