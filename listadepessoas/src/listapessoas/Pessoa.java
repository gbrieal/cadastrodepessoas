package listapessoas;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;
    private String categoria;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, String categoria) {
        this.nome = nome;
        this.idade = idade;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + " /// Idade: " + idade + "\n";
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        // TODO Auto-generated method stub
        if (this.idade > outraPessoa.getIdade()) {
            return 1;
        }
        if (this.idade < outraPessoa.getIdade()) {
            return -1;
        }
        return 0;
    }

}
