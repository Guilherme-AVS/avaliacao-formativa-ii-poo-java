# Gabarito — Think-Pair-Share — Aula 07

## Questão 1

Para:

```java
int[] numeros = {10, 20, 30, 40};
```

Os índices são:

```text
0 → 10
1 → 20
2 → 30
3 → 40
```

Portanto:

```java
numeros[2]
```

resulta em:

```text
30
```

E:

```java
numeros.length
```

resulta em:

```text
4
```

---

## Questão 2

O array possui quatro elementos e seus índices vão de `0` até `3`.

Portanto:

```java
numeros[4]
```

tenta acessar uma posição que não existe e provoca `ArrayIndexOutOfBoundsException`.

---

## Questão 3

Para arrays:

```java
array.length
```

é uma propriedade que informa a quantidade de posições.

Para `ArrayList`:

```java
lista.size()
```

é um método que informa a quantidade de elementos atualmente armazenados.

Exemplo:

```java
int[] numeros = {10, 20, 30};

ArrayList<Integer> lista = new ArrayList<>();
lista.add(10);
lista.add(20);
lista.add(30);

System.out.println(numeros.length); // 3
System.out.println(lista.size());   // 3
```

---

## Conceito principal

Arrays possuem tamanho definido na criação.

```java
int[] numeros = new int[5];
```

O array terá cinco posições.

Um `ArrayList` pode crescer ou diminuir durante a execução:

```java
ArrayList<Integer> numeros = new ArrayList<>();

numeros.add(10);
numeros.add(20);
numeros.remove(0);
```

A escolha depende do problema que está sendo resolvido.
