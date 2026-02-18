package br.com.william.seminario.Repository;

import br.com.william.seminario.Dominio.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorRepository {

    private final List<Professor> professores = new ArrayList<>();

    public void salvar(Professor professor){
        professores.add(professor);
    }

    public Professor buscarPorNome(String nome){
        for (Professor professor : professores) {
            if (professor.getNome().equalsIgnoreCase(nome)){
                return professor;
            }
        }
        return null;
    }

    public boolean remover(Professor professor) {
        return professores.remove(professor);
    }
}
