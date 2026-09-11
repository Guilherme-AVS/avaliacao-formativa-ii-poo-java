# Aula 07 — Arrays e ArrayList em Java

## Tema

**Arrays e ArrayList em Java**

## Objetivos

Ao final da aula, o estudante deverá ser capaz de:

- compreender arrays em Java;
- declarar e inicializar arrays;
- acessar e alterar elementos por índice;
- percorrer arrays;
- utilizar `length`;
- trabalhar com arrays de tipos primitivos e de objetos;
- compreender arrays multidimensionais;
- utilizar `ArrayList`;
- adicionar, consultar, alterar e remover elementos;
- obter o tamanho de um `ArrayList`;
- percorrer coleções;
- diferenciar array de `ArrayList`;
- escolher uma estrutura adequada para problemas simples;
- aplicar arrays e `ArrayList` na resolução de problemas.

## Conteúdos

1. Conceito de array
2. Declaração e criação
3. Índices
4. Inicialização
5. `length`
6. Percorrendo arrays com `for`
7. `for-each`
8. Alteração de elementos
9. Arrays de `String`
10. Arrays de objetos
11. Arrays bidimensionais
12. `ArrayList`
13. `add()`
14. `get()`
15. `set()`
16. `remove()`
17. `size()`
18. `contains()`
19. Percorrendo `ArrayList`
20. Array × `ArrayList`
21. Think-Pair-Share
22. Desafio — encontre os erros
23. Desafio final

## Estrutura

```text
aula-07-arrays-e-arraylist-em-java/
├── README.md
└── exemplos/
    ├── README.md
    ├── DeclaracaoEInicializacao.java
    ├── AcessoEAlteracao.java
    ├── PercorrendoComFor.java
    ├── ForEach.java
    ├── ArrayDeStrings.java
    ├── ArrayDeObjetos.java
    ├── ArrayBidimensional.java
    ├── ArrayListBasico.java
    ├── OperacoesArrayList.java
    ├── PercorrendoArrayList.java
    ├── ArrayVsArrayList.java
    └── CadastroComArrayList.java
```

## Compilação

Entre na pasta dos exemplos:

```bash
cd aulas/aula-07-arrays-e-arraylist-em-java/exemplos
```

Compile:

```bash
javac NomeDoArquivo.java
```

Execute:

```bash
java NomeDoArquivo
```

## Observação

`ArrayList` trabalha com objetos. Para valores numéricos, utilizamos classes wrapper como `Integer` e `Double`.

Exemplo:

```java
ArrayList<Integer> notas = new ArrayList<>();
```
