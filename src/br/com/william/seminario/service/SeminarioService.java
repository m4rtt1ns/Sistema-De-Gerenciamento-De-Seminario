package br.com.william.seminario.service;

import br.com.william.seminario.Dominio.Aluno;
import br.com.william.seminario.Dominio.Local;
import br.com.william.seminario.Dominio.Professor;
import br.com.william.seminario.Dominio.Seminario;
import br.com.william.seminario.Repository.AlunoRepository;
import br.com.william.seminario.Repository.LocalRepository;
import br.com.william.seminario.Repository.ProfessorRepository;
import br.com.william.seminario.Repository.SeminarioRepository;

public class SeminarioService {

    private final AlunoRepository alunoRepository;
    private final ProfessorRepository professorRepository;
    private final LocalRepository localRepository;
    private final SeminarioRepository seminarioRepository;

    public SeminarioService(AlunoRepository alunoRepository, ProfessorRepository professorRepository, LocalRepository localRepository, SeminarioRepository seminarioRepository) {
        this.alunoRepository = alunoRepository;
        this.professorRepository = professorRepository;
        this.localRepository = localRepository;
        this.seminarioRepository = seminarioRepository;
    }

    public void cadastrarAluno(String nome, int idade) {
        alunoRepository.salvar(new Aluno(nome, idade));
    }

    public void cadastrarProfessor(String nome, String especialidade) {
        professorRepository.salvar(new Professor(nome, especialidade));
    }

    public void cadastrarLocal(String endereco) {
        localRepository.salvar(new Local(endereco));
    }

    public void cadastrarSeminario(String titulo, String enderecoLocal, String nomeprofessor) {
        Local local = localRepository.buscarPorEndereco(enderecoLocal);
        Professor professor = professorRepository.buscarPorNome(nomeprofessor);

        if (local == null) {
            throw new IllegalArgumentException("Local não encontrado: " + enderecoLocal);
        }
        if (professor == null) {
            throw new IllegalArgumentException("Professor não encontrado: " + nomeprofessor);
        }
        seminarioRepository.salvar(new Seminario(titulo, local, professor));
    }

    public boolean matriculaAluno(String nomeAluno, String tituloSeminario) {

        Aluno aluno = alunoRepository.buscarPorNome(nomeAluno);
        Seminario seminario = seminarioRepository.buscarPorTitulo(tituloSeminario);

        if (aluno == null || seminario == null) return false;
        return seminario.adicionarAluno(aluno);
    }

    public void listarSeminarios() {
        for (Seminario s : seminarioRepository.listarTodos()){
            System.out.println(s);
        }
    }
}