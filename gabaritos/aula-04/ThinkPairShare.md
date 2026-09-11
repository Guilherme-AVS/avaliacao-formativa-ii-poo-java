# Gabarito — Think-Pair-Share — Aula 04

## Questão 1

Código:

```java
int contador = 1;

while (contador <= 3) {
    System.out.println(contador);
    contador++;
}
```

Saída:

```text
1
2
3
```

O loop termina porque, a cada iteração, `contador` é incrementado:

```java
contador++;
```

Depois da terceira iteração, `contador` passa a valer 4. A condição:

```java
contador <= 3
```

torna-se falsa.

---

## Questão 2

A diferença principal está no momento em que a condição é avaliada.

No `while`, a condição é verificada **antes** da execução do bloco:

```java
while (condicao) {
    // ...
}
```

Por isso, o bloco pode executar zero vezes.

No `do-while`, o bloco é executado primeiro e a condição é verificada depois:

```java
do {
    // ...
} while (condicao);
```

Por isso, o bloco executa **pelo menos uma vez**.

---

## Questão 3

Código:

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

Saída:

```text
0
1
2
3
4
```

O bloco é executado **5 vezes**.

As etapas são:

```text
i = 0 → executa
i = 1 → executa
i = 2 → executa
i = 3 → executa
i = 4 → executa
i = 5 → condição falsa
```

---

## Conceito principal

Um loop precisa de três elementos fundamentais:

1. **inicialização**;
2. **condição de continuidade**;
3. **atualização**.

No `for`:

```java
for (inicialização; condição; atualização) {
    // corpo
}
```

Um erro na atualização ou na condição pode produzir um **loop infinito**.

### Escolha da estrutura

- `while` → quando a repetição depende de uma condição;
- `do-while` → quando o bloco precisa executar pelo menos uma vez;
- `for` → quando existe uma estrutura clara de inicialização, condição e atualização.
