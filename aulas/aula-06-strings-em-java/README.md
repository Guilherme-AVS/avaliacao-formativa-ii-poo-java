# Aula 06 — Strings em Java

## Tema

**Strings em Java — manipulação e processamento de texto**

## Objetivos

Ao final da aula, o estudante deverá ser capaz de:

- compreender `String` em Java;
- declarar e inicializar strings;
- concatenar textos;
- comparar strings corretamente;
- utilizar os principais métodos da classe `String`;
- obter o tamanho de uma string;
- acessar caracteres;
- extrair partes de um texto;
- localizar caracteres e trechos;
- transformar texto para maiúsculas e minúsculas;
- remover espaços desnecessários;
- substituir partes de um texto;
- verificar prefixos e sufixos;
- compreender a imutabilidade de `String`;
- distinguir comparação de conteúdo de comparação de referência;
- resolver problemas simples de processamento de texto.

## Conteúdos

1. O que é `String`
2. Declaração e inicialização
3. Concatenação
4. `length()`
5. `charAt()`
6. `equals()` e `equalsIgnoreCase()`
7. `substring()`
8. `indexOf()` e `lastIndexOf()`
9. `toUpperCase()` e `toLowerCase()`
10. `trim()`
11. `replace()`
12. `contains()`
13. `startsWith()` e `endsWith()`
14. `isEmpty()` e `isBlank()`
15. Imutabilidade de `String`
16. Processamento de textos
17. Think-Pair-Share
18. Desafio — encontre os erros

## Estrutura

```text
aula-06-strings-em-java/
├── README.md
└── exemplos/
    ├── README.md
    ├── DeclaracaoEConcatenacao.java
    ├── TamanhoECaracteres.java
    ├── ComparacaoDeStrings.java
    ├── Substring.java
    ├── BuscaEmString.java
    ├── TransformacaoDeTexto.java
    ├── RemoverEspacos.java
    ├── Substituicao.java
    ├── VerificacaoDeConteudo.java
    ├── Imutabilidade.java
    └── ProcessamentoDeTexto.java
```

## Compilação

Entre na pasta:

```bash
cd aulas/aula-06-strings-em-java/exemplos
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

Os exemplos desta aula utilizam recursos da classe `String`. Arrays e `ArrayList` serão aprofundados na Aula 07.
