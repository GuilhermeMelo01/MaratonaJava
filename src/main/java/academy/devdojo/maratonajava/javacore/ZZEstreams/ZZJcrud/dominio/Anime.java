package academy.devdojo.maratonajava.javacore.ZZEstreams.ZZJcrud.dominio;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Anime {
    Integer id;
    String name;
    Integer episodes;
    Producer producer;
}
