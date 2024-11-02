import java.util.List;
import java.util.stream.Collectors;

public class ExemplosCollect {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        List<Pessoa> listaB = lista.stream()
                .filter(pessoa -> pessoa.getSexo().equals("F"))
                .collect(Collectors.toList());
        listaB.forEach(System.out::println);

        System.out.println("***");
    }
}
