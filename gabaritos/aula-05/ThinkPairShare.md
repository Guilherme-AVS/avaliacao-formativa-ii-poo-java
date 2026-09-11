# Gabarito — Think-Pair-Share — Aula 05

## Questão 1

Código:

```java
static int dobro(int numero) {
    return numero * 2;
}
```

### Respostas

1. Nome do método: `dobro`
2. Tipo de retorno: `int`
3. Parâmetro: `numero`
4. Retorno: `numero * 2`

---

## Questão 2

No método:

```java
static void saudar(String nome) {
    System.out.println(nome);
}
```

`nome` é um **parâmetro**.

Na chamada:

```java
saudar("Maria");
```

`"Maria"` é um **argumento**.

O parâmetro é declarado na definição do método. O argumento é o valor fornecido na chamada.

---

## Questão 3

Um método `void` não retorna um valor para quem o chamou:

```java
static void mostrarMensagem() {
    System.out.println("Olá!");
}
```

Um método com retorno declara o tipo que será devolvido:

```java
static int dobro(int numero) {
    return numero * 2;
}
```

Nesse caso, o método retorna um `int`.

---

## Conceito principal

Um método permite dividir um problema em partes menores e reutilizáveis.

Uma declaração possui, entre outros elementos:

```java
static int somar(int a, int b) {
    return a + b;
}
```

- `static` → modificador utilizado neste exemplo;
- `int` → tipo de retorno;
- `somar` → nome;
- `int a, int b` → parâmetros;
- `return` → devolve o resultado.

A chamada pode ser:

```java
int resultado = somar(10, 5);
```

A sobrecarga permite utilizar o mesmo nome para métodos com diferentes listas de parâmetros.
