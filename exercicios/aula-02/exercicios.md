# Exercícios — Aula 02

## Tipos de Dados, Variáveis e Operadores em Java

## Objetivos

Praticar:

- tipos de dados;
- variáveis;
- constantes;
- escopo;
- operadores aritméticos;
- operadores relacionais;
- operadores lógicos;
- incremento e decremento;
- atribuição composta;
- precedência;
- divisão inteira e decimal.

---

# 1. Think-Pair-Share

## Think — Resolva individualmente

### Questão 1

Observe:

```java
int a = 5;
int b = 2;

System.out.println(a / b);
```

Qual será a saída? Explique.

### Questão 2

Qual será o resultado?

```java
System.out.println(10 > 5 && 2 < 4);
```

Explique seu raciocínio.

### Questão 3

Observe:

```java
double x = 7 / 2;
System.out.println(x);
```

Qual será a saída? Por quê?

---

# 2. Tipos de dados

Declare uma variável para representar:

1. idade;
2. salário;
3. primeira letra do nome;
4. situação de aprovação;
5. nome completo.

Escolha o tipo adequado para cada informação.

---

# 3. Variáveis

Crie um programa que declare e exiba:

- nome;
- idade;
- altura;
- curso;
- aprovado.

Depois altere pelo menos dois valores e exiba novamente.

---

# 4. Constantes

Crie constantes para:

```text
PI = 3.14159
DIAS_SEMANA = 7
```

Exiba seus valores.

---

# 5. Operadores aritméticos

Dados:

```java
int a = 20;
int b = 6;
```

Calcule:

- soma;
- subtração;
- multiplicação;
- divisão inteira;
- resto.

---

# 6. Operadores relacionais

Dados:

```java
int idade = 20;
```

Crie expressões que verifiquem:

- idade igual a 18;
- idade diferente de 18;
- idade maior que 18;
- idade menor que 18;
- idade maior ou igual a 18;
- idade menor ou igual a 18.

---

# 7. Operadores lógicos

Considere:

```java
int idade = 20;
boolean temCarteira = true;
```

Crie uma expressão que determine se a pessoa pode dirigir.

Depois crie uma expressão que determine se a pessoa precisa estudar para obter a carteira.

---

# 8. Incremento e decremento

Explique a diferença entre:

```java
i++;
++i;
```

e entre:

```java
i--;
--i;
```

Depois escreva um pequeno programa demonstrando a diferença.

---

# 9. Atribuição composta

Reescreva usando operadores de atribuição composta:

```java
x = x + 5;
y = y - 2;
z = z * 3;
w = w / 4;
r = r % 2;
```

---

# 10. Precedência

Determine o resultado de:

```java
int resultado = 5 + 3 * 2;
```

Depois determine:

```java
int resultado = (5 + 3) * 2;
```

Explique por que os resultados são diferentes.

---

# 11. Strings

Crie:

```java
String nome1 = "Java";
String nome2 = new String("Java");
```

Verifique a igualdade dos conteúdos usando:

```java
equals()
```

Explique por que `equals()` deve ser utilizado para comparar conteúdos de `String`.

---

# 12. Desafio — Encontre os erros

Identifique e corrija os erros:

```java
public class Desafio {

    public static void main(String[] args) {

        int numero = "42";

        double resultado = 10 / 3;
        System.out.println("Resultado preciso: " + resultado);

        boolean teste = 5 + 10;

        int contador = 1;
        if (contador = 1) {
            System.out.println("Contador é 1");
        }

        String a = "abc";
        String b = "abc";

        if (a == b) {
            System.out.println("Strings iguais");
        }
    }
}
```

Para cada erro, explique:

1. o que está errado;
2. por que está errado;
3. como corrigir.

---

# 13. Desafio final

Crie um programa que receba ou declare os seguintes dados de um estudante:

- nome;
- idade;
- três notas.

Calcule:

- soma das notas;
- média;
- diferença entre a maior e a menor nota.

O programa deve utilizar operadores aritméticos e apresentar os resultados no console.

**Não utilize estruturas condicionais ou de repetição ainda.**
