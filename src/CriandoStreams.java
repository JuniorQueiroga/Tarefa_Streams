import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {
        Stream<String> stream = List.of("Antonio", "Ausgusto", "Teste").stream();

        Stream<String> set = Set.of("Antonio", "Ausgusto", "Teste").stream();

        Map<String, String> map = Map.of("Antonio", "Augusto");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();

        Stream<String> streamSTS = Stream.of("String", "asds");

    }
}
