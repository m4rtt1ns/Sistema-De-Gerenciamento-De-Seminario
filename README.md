# 📚 Sistema de Gerenciamento de Seminários (Java)

Projeto pessoal desenvolvido em Java com foco em **Programação Orientada a Objetos (POO)**, organização em camadas e aplicação de regras de negócio.  
O sistema simula o gerenciamento de seminários, permitindo o cadastro e relacionamento entre alunos, professores, locais e seminários.

---

## 🎯 Objetivo do Projeto

Praticar os principais conceitos de POO em Java, como:
- encapsulamento  
- composição e associação entre classes  
- separação de responsabilidades  
- organização de um projeto em camadas  

---

## 🚀 Funcionalidades

- Cadastro de alunos  
- Cadastro de professores  
- Cadastro de locais  
- Criação de seminários  
- Matrícula de alunos em seminários  
- Listagem de seminários com:
  - professor  
  - local  
  - quantidade de alunos  

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)  
- Encapsulamento  
- Relacionamentos entre classes  
- Camadas de projeto (domain, repository, service, app)  
- Regras de negócio:
  - Um aluno só pode estar matriculado em um seminário  
  - Um seminário pode ter vários alunos  
  - Um professor pode ministrar vários seminários  
  - Todo seminário deve ter um local  

---

## 🗂️ Estrutura do Projeto

```
src/
 └── main/
     └── java/
         └── br/
             └── com/
                 └── seunome/
                     └── seminarios/
                         ├── app/
                         │   └── Main.java
                         ├── domain/
                         │   ├── Aluno.java
                         │   ├── Professor.java
                         │   ├── Seminario.java
                         │   └── Local.java
                         ├── repository/
                         │   ├── AlunoRepository.java
                         │   ├── ProfessorRepository.java
                         │   ├── LocalRepository.java
                         │   └── SeminarioRepository.java
                         └── service/
                             └── SeminarioService.java
```

---

## ⚙️ Tecnologias Utilizadas

- Java 17  
- IntelliJ IDEA  
- Git  
- GitHub  

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/M4rtt1ns/seminarios-java.git
```

2. Abra o projeto no IntelliJ IDEA  

3. Execute a classe:

```
Main.java
```

---

## 📌 Observações

- Projeto desenvolvido para fins de estudo e prática  
- Os dados são armazenados apenas em memória  
- Não utiliza banco de dados  
- Pode ser evoluído futuramente para:
  - persistência em banco de dados  
  - interface gráfica  
  - API REST  

---

## 🔮 Possíveis Melhorias Futuras

- Implementar persistência com banco de dados  
- Criar interface gráfica (JavaFX ou Swing)  
- Criar uma API REST com Spring Boot  
- Implementar testes automatizados  
- Validações de dados (ex: idade mínima, campos obrigatórios)  

---

## ✍️ Autor

Desenvolvido por **William Martins**  
GitHub: https://github.com/m4rtt1ns

README.md
Exibindo README.md.