import java.util.List;

public class Pessoa {

    private String id;

    private String nome;

    private String sexo;

    private String nacionalidade;

    private int idade;

    public Pessoa() {

    }
    public Pessoa(String id, String nome, String sexo, String nacionalidade, int idade) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
        this.idade = idade;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Pessoa> populaPessoas() {
        Pessoa pessoa1 = new Pessoa("p1" , "Antonio A", "M", "Brasil", 15);
        Pessoa pessoa2 = new Pessoa("p2" , "Augusto Q", "M", "Brasil", 16);
        Pessoa pessoa3 = new Pessoa("p3" , "Maria L", "F", "Brasil", 17);
        Pessoa pessoa4 = new Pessoa("p4" , "Queiroga J", "M", "Brasil", 18);
        Pessoa pessoa5 = new Pessoa("p5" , "Luiza B", "F", "Brasil", 19);

        return List.of(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5);

    }
}
