public class Animal1 {
    private String nome;
    private int idade;

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

    public String emitirSom() {
        return "O animal emite um som!";
    }

    public String acaoAnimal() {
        return "O animal existe!";
    }
}
