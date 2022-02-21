package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {
    private final Set<String> avaliableSets = new HashSet<>();
    private final String name;

    public Aircraft(String name) {
        this.name = name;
    }

    {
        avaliableSets.add("1A");
        avaliableSets.add("1B");
    }

    public boolean bookSeat(String seat){
        return avaliableSets.remove(seat);
    }

    public String getName() {
        return name;
    }
}
