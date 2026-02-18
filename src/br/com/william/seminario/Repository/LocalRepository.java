package br.com.william.seminario.Repository;

import br.com.william.seminario.Dominio.Local;

import java.util.ArrayList;
import java.util.List;

public class LocalRepository {

    private final List<Local> locais = new ArrayList<>();

    public void salvar(Local local) {
        locais.add(local);
    }

    public List<Local> listarTodos() {
        return locais;
    }

    public Local buscarPorEndereco(String endereco) {
        for (Local local : locais) {
            if (local.getEndereco().equalsIgnoreCase(endereco)) {
                return local;
            }
        }
        return null;
    }

    public boolean remover(Local local) {
        return locais.remove(local);
    }
}
