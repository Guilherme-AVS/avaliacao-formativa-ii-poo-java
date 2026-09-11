# Exercícios — Aula 07

## Arrays e ArrayList em Java

## Objetivos

Praticar:

- criação e inicialização de arrays;
- índices;
- `length`;
- percursos com `for`;
- `for-each`;
- arrays de `String`;
- arrays bidimensionais;
- `ArrayList`;
- `add()`, `get()`, `set()`, `remove()`, `size()` e `contains()`;
- escolha entre array e `ArrayList`.

---

# 1. Think-Pair-Share

## Think — Resolva individualmente

### Questão 1

Considere:

```java
int[] numeros = {10, 20, 30, 40};
```

Qual é o valor de:

```java
numeros[2]
```

E qual é o valor de:

```java
numeros.length
```

### Questão 2

Por que o acesso:

```java
numeros[4]
```

é inválido?

### Questão 3

Qual é a diferença entre:

```java
array.length
```

e:

```java
lista.size()
```

---

# 2. Média da turma

Crie um programa que armazene cinco notas em um array e calcule a média.

Ao final, mostre:

- todas as notas;
- média;
- maior nota;
- menor nota.

---

# 3. Contagem de valores

Crie um método que receba um array de inteiros e conte quantos valores são maiores que 10.

```java
static int contarMaioresQueDez(int[] valores)
```

---

# 4. Busca

Crie um método:

```java
static boolean contem(int[] valores, int procurado)
```

que retorne `true` quando o valor existir no array.

---

# 5. Array de Strings

Crie um array com cinco nomes.

Percorra o array e mostre:

```text
1 - Ana
2 - Bruno
3 - Carla
...
```

---

# 6. Array bidimensional

Crie uma matriz `3 x 3` de inteiros.

Preencha a matriz e mostre todos os seus elementos utilizando dois `for`.

Depois calcule a soma de todos os elementos.

---

# 7. Lista dinâmica

Crie um `ArrayList<String>` chamado `nomes`.

Adicione cinco nomes e mostre todos eles.

---

# 8. Operações com ArrayList

Utilizando um `ArrayList<Integer>`:

1. adicione cinco números;
2. mostre o tamanho;
3. consulte um elemento com `get()`;
4. altere um elemento com `set()`;
5. remova um elemento;
6. verifique se determinado número está presente.

---

# 9. Remoção

Crie um `ArrayList<String>` com nomes de alunos.

Remova um aluno pelo índice.

Depois remova outro aluno pelo conteúdo.

Explique a diferença entre:

```java
remove(2)
```

e:

```java
remove("Ana")
```

---

# 10. Maior valor

Crie um método:

```java
static int maior(int[] valores)
```

que retorne o maior valor do array.

---

# 11. Conversão

Crie um array:

```java
String[] nomes = {"Ana", "Bruno", "Carla"};
```

Converta seus elementos para um `ArrayList<String>`.

---

# 12. Desafio — encontre os erros

Corrija o código:

```java
import java.util.ArrayList;

public class Desafio {

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30};

        System.out.println(numeros[3]);

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Bruno");

        System.out.println(nomes[0]);

        System.out.println(nomes.length);
    }
}
```

Identifique todos os erros e explique cada um.

---

# 13. Desafio final — cadastro de alunos

Crie um programa que mantenha uma lista de alunos utilizando `ArrayList<String>`.

O programa deverá possuir métodos para:

```java
adicionarAluno()
listarAlunos()
buscarAluno()
removerAluno()
```

O programa deve:

1. adicionar alunos;
2. listar todos;
3. procurar um aluno pelo nome;
4. remover um aluno;
5. informar quando o aluno procurado não existir.

Organize a solução utilizando métodos.

---

## Reflexão final

Responda:

> Em quais situações você escolheria um array e em quais escolheria um `ArrayList`?

Justifique sua resposta.
