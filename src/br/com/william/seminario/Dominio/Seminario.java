package br.com.william.seminario.Dominio;

import java.util.ArrayList;
import java.util.List;

public class Seminario {
    private String titulo;
    private Local local;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Local local, Professor professor) {
        this.titulo = titulo;
        this.local = local;
        this.professor = professor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public boolean adicionarAluno(Aluno aluno) {
        if (aluno == null) return false;

        if (aluno.getSeminario() != null) {
            return false;
        }

        aluno.setSeminario(this);
        return alunos.add(aluno);
    }

    public boolean removerAluno(Aluno aluno) {
        if (aluno == null) return false;

        boolean removido = alunos.remove(aluno);
        if (removido) {
            aluno.setSeminario(null);
        }
        return removido;
    }

    public String toString() {
        return "=== DETALHES DO SEMINÁRIO ===\n" +
                "Título: " + this.titulo + "\n" +
                "Local: " + (this.local != null ? this.local.getEndereco() : "Não definido") + "\n" +
                "Professor: " + (this.professor != null ? this.professor.getNome() : "Não definido") + "\n" +
                "Qtd Alunos: " + (this.alunos != null ? this.alunos.size() : 0) + "\n" +
                "=============================";
    }
}
