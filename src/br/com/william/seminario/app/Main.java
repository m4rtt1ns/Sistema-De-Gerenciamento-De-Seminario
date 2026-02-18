package br.com.william.seminario.app;


import br.com.william.seminario.Repository.AlunoRepository;
import br.com.william.seminario.Repository.LocalRepository;
import br.com.william.seminario.Repository.ProfessorRepository;
import br.com.william.seminario.Repository.SeminarioRepository;
import br.com.william.seminario.service.SeminarioService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AlunoRepository alunoRepository = new AlunoRepository();
        ProfessorRepository professorRepository = new ProfessorRepository();
        LocalRepository localRepository = new LocalRepository();
        SeminarioRepository seminarioRepository = new SeminarioRepository();

        SeminarioService service = new SeminarioService(
                alunoRepository,
                professorRepository,
                localRepository,
                seminarioRepository
        );

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar professor");
            System.out.println("3 - Cadastrar local");
            System.out.println("4 - Cadastrar seminário");
            System.out.println("5 - Matricular aluno em seminário");
            System.out.println("6 - Listar seminários");
            System.out.println("0 - Sair");

            int op = Integer.parseInt(sc.nextLine());

            try {
                switch (op) {
                    case 1 -> {
                        System.out.print("Nome do aluno: ");
                        String nome = sc.nextLine();
                        System.out.print("Idade: ");
                        int idade = Integer.parseInt(sc.nextLine());
                        service.cadastrarAluno(nome, idade);
                        System.out.println("Aluno cadastrado!");
                    }
                    case 2 -> {
                        System.out.print("Nome do professor: ");
                        String nome = sc.nextLine();
                        System.out.print("Especialidade: ");
                        String esp = sc.nextLine();
                        service.cadastrarProfessor(nome, esp);
                        System.out.println("Professor cadastrado!");
                    }
                    case 3 -> {
                        System.out.print("Endereço do local: ");
                        String endereco = sc.nextLine();
                        service.cadastrarLocal(endereco);
                        System.out.println("Local cadastrado!");
                    }
                    case 4 -> {
                        System.out.print("Título do seminário: ");
                        String titulo = sc.nextLine();
                        System.out.print("Endereço do local: ");
                        String endereco = sc.nextLine();
                        System.out.print("Nome do professor: ");
                        String prof = sc.nextLine();
                        service.cadastrarSeminario(titulo, endereco, prof);
                        System.out.println("Seminário cadastrado!");
                    }
                    case 5 -> {
                        System.out.print("Nome do aluno: ");
                        String aluno = sc.nextLine();
                        System.out.print("Título do seminário: ");
                        String sem = sc.nextLine();
                        boolean ok = service.matriculaAluno(aluno, sem);
                        System.out.println(ok ? "Aluno matriculado!" : "Erro ao matricular.");
                    }
                    case 6 -> service.listarSeminarios();
                    case 0 -> {
                        System.out.println("Saindo...");
                        return;
                    }
                    default -> System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
