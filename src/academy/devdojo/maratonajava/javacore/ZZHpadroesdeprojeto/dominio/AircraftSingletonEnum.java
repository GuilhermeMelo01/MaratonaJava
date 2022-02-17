package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
    INSTANCE;
    private final Set<String> avaliableSets;

    AircraftSingletonEnum() {
        this.avaliableSets = new HashSet<>();
        this.avaliableSets.add("1A");
        this.avaliableSets.add("1B");
    }

    public boolean bookSeat(String seat){
        return avaliableSets.remove(seat);
    }
}
