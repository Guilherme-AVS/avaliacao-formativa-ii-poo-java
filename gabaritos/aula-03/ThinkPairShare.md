# Gabarito — Think-Pair-Share — Aula 03

## Questão 1

Código:

```java
int idade = 17;

if (idade >= 18) {
    System.out.println("Pode entrar.");
} else {
    System.out.println("Não pode entrar.");
}
```

Saída:

```text
Não pode entrar.
```

A expressão `idade >= 18` resulta em `false`, pois 17 é menor que 18. Portanto, o bloco `else` é executado.

---

## Questão 2

No primeiro exemplo, somente existe uma ação para a condição verdadeira.

```java
if (nota >= 7) {
    System.out.println("Aprovado");
}
```

Se a condição for falsa, nada será executado.

No segundo exemplo, existe uma alternativa:

```java
if (nota >= 7) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}
```

Assim, uma das duas mensagens sempre será exibida.

---

## Questão 3

Código:

```java
int x = 10;

if (x > 5 && x < 20) {
    System.out.println("A");
} else {
    System.out.println("B");
}
```

Saída:

```text
A
```

As duas condições são verdadeiras:

```text
10 > 5  → true
10 < 20 → true
```

Logo:

```text
true && true → true
```

O bloco do `if` é executado.

---

## Conceito principal

As estruturas condicionais permitem que o programa **tome decisões a partir do resultado de expressões booleanas**.

A escolha da estrutura depende do problema:

- `if` → uma decisão simples;
- `if/else` → duas alternativas;
- `else if` → várias alternativas;
- `switch` → seleção entre valores/casos;
- operador ternário → decisão simples que produz um valor.
