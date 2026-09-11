# Gabarito — Think-Pair-Share — Aula 02

## Questão 1

Código:

```java
int a = 5;
int b = 2;

System.out.println(a / b);
```

Saída:

```text
2
```

Como `a` e `b` são `int`, a divisão realizada é uma **divisão inteira**. A parte decimal é descartada.

---

## Questão 2

Código:

```java
System.out.println(10 > 5 && 2 < 4);
```

Resultado:

```text
true
```

Porque:

```text
10 > 5 → true
2 < 4  → true
true && true → true
```

---

## Questão 3

Código:

```java
double x = 7 / 2;
System.out.println(x);
```

Saída:

```text
3.0
```

Embora `x` seja `double`, a expressão `7 / 2` é calculada primeiro utilizando dois operandos `int`.

Portanto:

```text
7 / 2 → 3
```

Depois o valor inteiro `3` é convertido para `double`:

```text
3.0
```

Para obter `3.5`, pelo menos um dos operandos deve ser decimal:

```java
double x = 7.0 / 2;
```

ou:

```java
double x = 7 / 2.0;
```

---

## Conceitos principais

| Situação | Resultado |
|---|---|
| `5 / 2` | `2` |
| `5.0 / 2` | `2.5` |
| `5 / 2.0` | `2.5` |
| `double x = 5 / 2` | `2.0` |

### Observação pedagógica

A ideia central desta atividade é fazer o estudante perceber que o **tipo dos operandos influencia a operação realizada**, e não apenas o tipo da variável que recebe o resultado.
