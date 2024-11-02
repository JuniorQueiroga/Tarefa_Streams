import java.util.List;
import java.util.stream.Stream;

public class Selecionar {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();
        Stream<Pessoa> stream = lista.stream().filter(pessoa -> pessoa.getSexo().equals("F"));
    }
}
