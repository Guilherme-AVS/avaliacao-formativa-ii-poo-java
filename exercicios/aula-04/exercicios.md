# Exercícios — Aula 04

## Estruturas de Repetição em Java

## Objetivos

Praticar:

- `while`;
- `do-while`;
- `for`;
- contadores;
- acumuladores;
- loops aninhados;
- `break`;
- `continue`;
- condições de parada.

---

# 1. Think-Pair-Share

## Think — Resolva individualmente

### Questão 1

Observe:

```java
int contador = 1;

while (contador <= 3) {
    System.out.println(contador);
    contador++;
}
```

Qual será a saída?

Explique por que o loop termina.

### Questão 2

Qual é a principal diferença entre:

```java
while (condicao) {
    // ...
}
```

e:

```java
do {
    // ...
} while (condicao);
```

### Questão 3

Analise:

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

Quantas vezes o bloco será executado?

---

# 2. `while`

Crie um programa que exiba os números de 1 a 10 utilizando `while`.

---

# 3. Contagem regressiva

Crie um programa que exiba:

```text
10
9
8
7
6
5
4
3
2
1
```

Utilize `while`.

---

# 4. `do-while`

Crie um programa que exiba os números de 1 a 5 utilizando `do-while`.

Depois altere a condição inicial para demonstrar que o bloco do `do-while` executa pelo menos uma vez.

---

# 5. `for`

Crie um programa que exiba os números pares de 2 a 20 utilizando `for`.

---

# 6. Contador e acumulador

Calcule a soma dos números de 1 a 100 utilizando um loop.

Ao final, exiba:

```text
Soma = 5050
```

---

# 7. Média

Considere as notas:

```java
double n1 = 7.0;
double n2 = 8.0;
double n3 = 9.0;
double n4 = 6.0;
```

Utilize um loop para calcular a soma e a média.

---

# 8. Loop aninhado

Utilize dois `for` para produzir:

```text
* * * *
* * * *
* * * *
```

---

# 9. `break`

Crie um loop de 1 a 100 que seja interrompido quando chegar ao número 37.

---

# 10. `continue`

Crie um loop de 1 a 20 que exiba somente os números ímpares utilizando `continue`.

---

# 11. Tabuada

Crie um programa que exiba a tabuada de um número de 1 a 10.

Exemplo para 7:

```text
7 x 1 = 7
7 x 2 = 14
...
7 x 10 = 70
```

---

# 12. Desafio — encontre os erros

Identifique e corrija os erros:

```java
public class Desafio {

    public static void main(String[] args) {

        int contador = 1;

        while (contador <= 5) {
            System.out.println(contador);
        }

        for (int i = 0; i < 10; i--) {
            System.out.println(i);
        }

        int numero = 10;

        do {
            System.out.println(numero);
            numero++;
        } while (numero < 10);

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0);
                continue;

            System.out.println(i);
        }
    }
}
```

Para cada erro, explique:

1. o que está errado;
2. por que pode causar comportamento incorreto;
3. como corrigir.

---

# 13. Desafio final

Crie um programa que percorra os números de 1 a 100 e calcule:

- quantidade de números pares;
- quantidade de números ímpares;
- soma dos pares;
- soma dos ímpares.

Ao final, exiba todos os resultados.

Depois modifique o programa para interromper o processamento quando encontrar um número divisível por 37.

**Não utilize arrays ou coleções.**
