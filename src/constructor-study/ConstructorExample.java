class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
               "nome=" + nome +
               ", idade=" + idade +
               '}';
    }
}

class Aluno extends Pessoa {
    private int periodo;

    public Aluno(String nome, int idade, int periodo) {
        super(nome, idade);
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Aluno{" +
               "nome=" + getNome() +
               ", idade=" + getIdade() +
               ", periodo=" + periodo +
               '}';
    }
}
