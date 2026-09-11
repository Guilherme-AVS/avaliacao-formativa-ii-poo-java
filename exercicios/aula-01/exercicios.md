# Exercícios — Aula 01

## Apresentação da Disciplina e Introdução ao Java

## Objetivos

Praticar os conceitos introdutórios da aula:

- Java;
- JDK, JRE e JVM;
- compilação e execução;
- estrutura básica de um programa Java;
- `class`;
- `main`;
- `System.out.println()`;
- portabilidade;
- aplicações do Java.

---

# 1. Think-Pair-Share

## Think — Resolva individualmente

### Questão 1

Uma startup precisa desenvolver um sistema que deverá funcionar em diferentes plataformas.

Quais características do Java podem ser relevantes para essa escolha?

Explique sua resposta.

### Questão 2

Explique, com suas palavras, a diferença entre:

- JDK;
- JRE;
- JVM.

### Questão 3

Por que o nome do arquivo precisa corresponder ao nome de uma classe `public`?

---

# 2. Primeiro programa Java

Crie um programa chamado `Hello` que imprima:

```text
Olá, mundo!
```

O arquivo deve ser:

```text
Hello.java
```

Depois:

1. compile o programa;
2. execute o programa;
3. observe a saída no console.

---

# 3. Modifique o programa

Altere o programa para imprimir seu nome.

Exemplo:

```text
Olá, Ivna!
```

Use `System.out.println()`.

---

# 4. Imprima seus dados

Crie um programa que imprima seus dados no console.

Inclua pelo menos:

- nome;
- curso;
- instituição;
- semestre.

Exemplo:

```text
Nome: Ana
Curso: Ciência da Computação
Instituição: UNICAP
Semestre: 2026.2
```

---

# 5. Identifique os elementos do código

Observe:

```java
public class Hello {

    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

Explique a função de:

1. `public`;
2. `class`;
3. `Hello`;
4. `static`;
5. `void`;
6. `main`;
7. `String[] args`;
8. `System.out.println()`.

---

# 6. Compile e execute pelo terminal

Crie `Hello.java` e execute:

```bash
javac Hello.java
```

Depois:

```bash
java Hello
```

Registre:

- o comando utilizado para compilar;
- o comando utilizado para executar;
- a saída produzida.

---

# 7. Desafio

Crie um programa chamado `Perfil` que produza uma pequena apresentação no console.

A saída deve conter:

```text
========================
       MEU PERFIL
========================
Nome:
Curso:
Universidade:
Semestre:
========================
```

Use somente os recursos estudados até esta aula.

---

# 8. Reflexão

Responda:

> Por que Java precisa ser compilado antes de ser executado?

Relacione sua resposta com os conceitos de **bytecode** e **JVM**.
