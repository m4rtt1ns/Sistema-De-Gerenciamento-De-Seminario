package br.com.william.seminario.Dominio;

public class Professor {
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String toString() {
        return "Professor{" +
                "Nome='" + nome + '\'' +
                ", Especialidades'" + especialidade + '\'' +
                '}';
    }
}
