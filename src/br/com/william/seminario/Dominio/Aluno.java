package br.com.william.seminario.Dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;


    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public boolean estaMatriculado(){
        return this.seminario != null;
    }

    public String toString(){
        return "Aluno{" +
                "Nome='" + nome + '\'' +
                ", Idade =" + idade +
                "Seminario=" + (seminario != null ? seminario.getTitulo() : "Nenhum") +
                '}';
    }
}
