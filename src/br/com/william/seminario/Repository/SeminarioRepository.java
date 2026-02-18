package br.com.william.seminario.Repository;

import br.com.william.seminario.Dominio.Seminario;

import java.util.ArrayList;
import java.util.List;

public class SeminarioRepository {

    private final List<Seminario> seminarios = new ArrayList<>();

    public void salvar(Seminario seminario) {
        seminarios.add(seminario);
    }

    public List<Seminario> listarTodos() {
        return seminarios;
    }

    public Seminario buscarPorTitulo(String titulo) {
        for (Seminario seminario : seminarios) {
            if (seminario.getTitulo().equalsIgnoreCase(titulo)) {
                return seminario;
            }
        }
        return null;
    }

    public boolean remover(Seminario seminario) {
        return seminarios.remove(seminario);
    }
}
