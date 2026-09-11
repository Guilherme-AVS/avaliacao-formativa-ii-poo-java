# Exercícios — Aula 03

## Estruturas Condicionais em Java

## Objetivos

Praticar:

- `if`;
- `if/else`;
- `else if`;
- condições compostas;
- operador ternário;
- `switch`;
- `switch expression`.

---

# 1. Think-Pair-Share

## Think — Resolva individualmente

### Questão 1

Observe:

```java
int idade = 17;

if (idade >= 18) {
    System.out.println("Pode entrar.");
} else {
    System.out.println("Não pode entrar.");
}
```

Qual será a saída? Explique.

### Questão 2

Qual é a diferença entre:

```java
if (nota >= 7) {
    System.out.println("Aprovado");
}
```

e:

```java
if (nota >= 7) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}
```

### Questão 3

O que será exibido?

```java
int x = 10;

if (x > 5 && x < 20) {
    System.out.println("A");
} else {
    System.out.println("B");
}
```

---

# 2. `if`

Crie um programa que verifique se uma pessoa é maior de idade.

---

# 3. `if/else`

Crie um programa que receba uma nota e informe:

- `Aprovado`, se a nota for maior ou igual a 7;
- `Reprovado`, caso contrário.

---

# 4. `else if`

Crie um programa que classifique uma nota:

- 9 ou 10 → Excelente;
- 7 ou 8 → Bom;
- 5 ou 6 → Regular;
- abaixo de 5 → Insuficiente.

---

# 5. Condições compostas

Uma pessoa pode acessar um sistema se:

- tiver 18 anos ou mais;
- possuir cadastro ativo.

Represente essa regra utilizando operadores lógicos.

---

# 6. Operador ternário

Reescreva utilizando operador ternário:

```java
if (idade >= 18) {
    situacao = "Maior de idade";
} else {
    situacao = "Menor de idade";
}
```

---

# 7. `switch`

Crie um programa que receba um número de 1 a 7 e exiba o respectivo dia da semana.

Utilize:

- `case`;
- `break`;
- `default`.

---

# 8. `switch expression`

Reescreva o exercício anterior utilizando `switch expression`.

O resultado deve ser armazenado em uma variável `String`.

---

# 9. Desafio — encontre os erros

Identifique e corrija os erros:

```java
public class Desafio {

    public static void main(String[] args) {

        int idade = 20;

        if (idade = 18) {
            System.out.println("Tem 18 anos.");
        }

        int dia = 2;

        switch (dia) {
            case 1:
                System.out.println("Domingo");

            case 2:
                System.out.println("Segunda");

            default:
                System.out.println("Outro dia");
        }

        int nota = 8;

        if (nota >= 7)
            System.out.println("Aprovado");
            System.out.println("Parabéns!");
        else
            System.out.println("Reprovado");
    }
}
```

Para cada erro, explique:

1. o que está errado;
2. por que está errado;
3. como corrigir.

---

# 10. Desafio final

Crie um programa de classificação de estudantes.

O programa deve possuir:

- nome;
- nota final;
- frequência.

As regras são:

- nota >= 7 e frequência >= 75% → Aprovado;
- nota >= 5 e frequência >= 75% → Exame;
- qualquer outra situação → Reprovado.

Implemente primeiro com `if/else if/else`.

Depois analise se alguma parte poderia ser representada de forma mais simples com operador ternário.

**Não utilize estruturas de repetição ainda.**
