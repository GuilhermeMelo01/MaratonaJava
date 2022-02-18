package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSigletonEager {
    private static final AircraftSigletonEager INSTANCE = new AircraftSigletonEager("787-900");
    private final Set<String> avaliableSets = new HashSet<>();
    private final String name;

    private AircraftSigletonEager(String name) {
        this.name = name;
    }

    {
        avaliableSets.add("1A");
        avaliableSets.add("1B");
    }

    public static AircraftSigletonEager getINSTANCE(){
        return INSTANCE;
    }

    public boolean bookSeat(String seat){
        return avaliableSets.remove(seat);
    }
}
