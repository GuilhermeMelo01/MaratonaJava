package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSigletonLazy {
    private static AircraftSigletonLazy INSTANCE;
    private final Set<String> avaliableSets = new HashSet<>();
    private final String name;

    private AircraftSigletonLazy(String name) {
        this.name = name;
    }

    {
        avaliableSets.add("1A");
        avaliableSets.add("1B");
    }

    public static AircraftSigletonLazy getINSTANCE(){
       if (INSTANCE == null) {
           synchronized (AircraftSigletonLazy.class) {
               if (INSTANCE == null) {
                   INSTANCE = new AircraftSigletonLazy("787-900");
               }
           }
       }
        return INSTANCE;
    }

    public boolean bookSeat(String seat){
        return avaliableSets.remove(seat);
    }
}
