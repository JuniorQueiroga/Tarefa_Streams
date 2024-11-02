import java.util.List;
import java.util.stream.Stream;

public class ExemplosForEach {
    public static void main(String[] args) {
        System.out.println("***Toda a lista ****");

        List<Pessoa> lista = new Pessoa().populaPessoas();

        lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("***Apenas sexo feminino ****");

        lista.stream()
                .filter(pessoa -> pessoa.getSexo().equals("F"))
                .map(Pessoa::getNome)
                .forEach(p -> System.out.println(p));
    }
}
