# Aula 01 — Apresentação da Disciplina e Introdução ao Java

## Tema

**Apresentação da disciplina e introdução ao Java**

> Os primeiros passos para transformar ideias em software.

## Objetivos

Ao final da aula, o estudante deverá ser capaz de:

- compreender a proposta e a organização da disciplina;
- reconhecer as principais características da linguagem Java;
- diferenciar JDK, JRE e JVM;
- compreender a ideia de bytecode e portabilidade;
- identificar a estrutura básica de um programa Java;
- executar um primeiro programa Java;
- reconhecer o papel de `class`, `main` e `System.out.println`;
- comparar Java, de forma introdutória, com Python, C++ e JavaScript.

## Conteúdos

1. Apresentação da disciplina
2. Ementa e organização em macro-módulos
3. Metodologia e critérios de avaliação
4. O que é Java?
5. História do Java
6. Características do Java
7. Aplicações reais
8. Ambiente Java
   - JDK — Java Development Kit
   - JRE — Java Runtime Environment
   - JVM — Java Virtual Machine
9. Configuração do ambiente
10. Estrutura básica de um programa Java
11. Primeiro programa: `Hello`
12. Comparação introdutória com outras linguagens
13. Dinâmica PBL

## Ambiente

A aula recomenda:

- JDK 17 ou superior;
- IntelliJ IDEA, Eclipse ou VS Code;
- GitHub para compartilhamento de código.

Para verificar o ambiente:

```bash
java -version
javac -version
```

## Primeiro programa

O exemplo principal da aula é `Hello.java`.

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

Para compilar:

```bash
javac Hello.java
```

Para executar:

```bash
java Hello
```

## Conceitos essenciais

### `class`

Define uma classe Java.

### `main`

É o ponto de entrada da aplicação.

### `public`

Indica acesso público.

### `static`

Indica que o método pertence à classe.

### `void`

Indica que o método não retorna um valor.

### `System.out.println()`

Imprime uma mensagem no console e adiciona uma nova linha.

## JDK, JRE e JVM

| Componente | Função |
|---|---|
| JDK | Ambiente completo para desenvolvimento, incluindo compilador e ferramentas |
| JRE | Ambiente para execução das aplicações Java |
| JVM | Executa o bytecode Java |

## Atividade PBL

Problema:

> Uma startup precisa criar um sistema multiplataforma que funcionará em dispositivos móveis, web e desktop. A equipe precisa decidir qual linguagem de programação usar.

Os grupos devem analisar:

- requisitos técnicos;
- desempenho;
- portabilidade;
- segurança;
- ecossistema;
- mercado de trabalho;
- fatores econômicos;
- suporte e evolução da linguagem.

## Tarefa para casa

Instalar o JDK e uma IDE, preferencialmente VS Code, e implementar um programa simples que imprima seus dados.

## Referência da aula

Material baseado nos slides da **Aula 01 — Apresentação do Plano + Introdução ao Java**, semestre 2026.2.
