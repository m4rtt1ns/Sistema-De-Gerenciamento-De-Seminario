package br.com.william.seminario.Repository;

import br.com.william.seminario.Dominio.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {

    private final List<Aluno> alunos = new ArrayList<>();

    public void salvar(Aluno aluno){
        alunos.add(aluno);
    }

    public List<Aluno> listarTodos(){
        return alunos;
    }

    public Aluno buscarPorNome(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }

    public boolean remover(Aluno aluno) {
        return alunos.remove(aluno);
    }
}
