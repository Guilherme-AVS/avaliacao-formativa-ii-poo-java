# Exercícios — Aula 05

## Métodos em Java

## Objetivos

Praticar:

- declaração e chamada de métodos;
- `void`;
- parâmetros;
- argumentos;
- retorno;
- `return`;
- escopo;
- métodos `static`;
- sobrecarga;
- decomposição de problemas.

---

# 1. Think-Pair-Share

## Think — Resolva individualmente

### Questão 1

Analise:

```java
static int dobro(int numero) {
    return numero * 2;
}
```

Responda:

1. Qual é o nome do método?
2. Qual é o tipo de retorno?
3. Qual é o parâmetro?
4. O que o método retorna?

### Questão 2

Qual é a diferença entre um parâmetro e um argumento?

Considere:

```java
static void saudar(String nome) {
    System.out.println(nome);
}

saudar("Maria");
```

### Questão 3

Qual é a diferença entre um método `void` e um método que retorna um valor?

---

# 2. Primeiro método

Crie um método chamado `mostrarMensagem()` que exiba:

```text
Olá, Java!
```

Chame o método três vezes.

---

# 3. Método com parâmetro

Crie um método:

```java
static void apresentar(String nome)
```

que exiba:

```text
Olá, NOME!
```

Teste com pelo menos três nomes.

---

# 4. Método com retorno

Crie um método `quadrado(int numero)` que retorne o quadrado de um número.

Exemplo:

```text
quadrado(5) → 25
```

---

# 5. Maior número

Crie um método:

```java
static int maior(int a, int b)
```

que retorne o maior entre dois números.

---

# 6. Par ou ímpar

Crie um método:

```java
static boolean ehPar(int numero)
```

que retorne `true` quando o número for par e `false` caso contrário.

---

# 7. Média

Crie um método que receba três notas e retorne a média.

Depois crie outro método que receba a média e retorne:

```text
true
```

se o estudante estiver aprovado, considerando média maior ou igual a 7.

---

# 8. Sobrecarga

Crie três versões do método `somar`:

```java
somar(int, int)
somar(double, double)
somar(int, int, int)
```

Teste as três versões.

---

# 9. Escopo

Analise:

```java
public class Exemplo {

    static void teste() {
        int numero = 10;
        System.out.println(numero);
    }

    public static void main(String[] args) {
        teste();

        System.out.println(numero);
    }
}
```

O código compila?

Se não, explique o motivo e corrija o problema.

---

# 10. Decomposição

Crie um programa de calculadora utilizando métodos separados para:

- soma;
- subtração;
- multiplicação;
- divisão.

O `main` deve apenas organizar as chamadas.

---

# 11. Desafio — encontre os erros

Corrija os problemas:

```java
public class Desafio {

    static int calcular(int a, int b) {
        System.out.println(a + b);
    }

    static void apresentar(String nome) {
        return nome;
    }

    static int dobro(int numero) {
        numero * 2;
    }

    public static void main(String[] args) {
        calcular(10);
        apresentar();
        System.out.println(dobro());
    }
}
```

Para cada erro, explique:

1. o que está errado;
2. qual regra de métodos foi violada;
3. como corrigir.

---

# 12. Desafio final

Crie um programa para calcular o desempenho de um estudante.

Separe o programa em métodos:

```text
calcularMedia()
verificarAprovacao()
exibirResultado()
```

O programa deve:

1. receber três notas;
2. calcular a média;
3. verificar se a média é maior ou igual a 7;
4. exibir a média;
5. exibir `Aprovado` ou `Reprovado`.

**Regra:** o `main` deve apenas coordenar a execução. A lógica deve ficar distribuída nos métodos.
