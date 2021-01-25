public class Participante {
    String nome;
    int idade;

    public Participante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Participante(){

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
}

