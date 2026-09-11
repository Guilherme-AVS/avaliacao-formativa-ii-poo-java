# Exercícios — Aula 06

## Strings em Java

## Objetivos

Praticar:

- declaração e concatenação de `String`;
- `length()`;
- `charAt()`;
- `equals()`;
- `equalsIgnoreCase()`;
- `substring()`;
- `indexOf()`;
- `lastIndexOf()`;
- `toUpperCase()`;
- `toLowerCase()`;
- `trim()` e `strip()`;
- `replace()`;
- `contains()`;
- `startsWith()` e `endsWith()`;
- `isEmpty()` e `isBlank()`;
- imutabilidade de `String`;
- processamento de textos.

---

# 1. Think-Pair-Share

## Think — Resolva individualmente

### Questão 1

Considere:

```java
String nome = "Ana";
```

Qual será o resultado de:

```java
nome.length()
```

### Questão 2

Qual é a diferença entre:

```java
nome.equals(outroNome)
```

e:

```java
nome == outroNome
```

Por que `equals()` é normalmente utilizado para comparar o conteúdo de Strings?

### Questão 3

O que acontece quando executamos:

```java
String texto = "java";
texto.toUpperCase();

System.out.println(texto);
```

O resultado será `JAVA`? Explique.

---

# 2. Nome completo

Crie um programa que armazene nome e sobrenome em duas Strings e monte o nome completo.

Exemplo:

```text
Nome completo: Maria Silva
```

---

# 3. Tamanho do texto

Leia ou defina uma String e informe:

- quantidade de caracteres;
- primeiro caractere;
- último caractere.

---

# 4. Comparação

Crie um programa que compare uma senha digitada com uma senha armazenada.

Use `equals()`.

Depois faça uma segunda versão que aceite a senha sem diferenciar maiúsculas e minúsculas.

---

# 5. Primeiro e último nome

Considere:

```text
"Maria Silva"
```

Utilize métodos de `String` para localizar o espaço e separar o primeiro nome do sobrenome.

---

# 6. Contagem de caracteres

Crie um método:

```java
static int contarLetrasA(String texto)
```

que conte quantas vezes a letra `a` aparece no texto.

Faça a contagem considerando também `A`.

---

# 7. Palavras-chave

Crie um programa que verifique se uma mensagem contém determinadas palavras.

O programa deve testar, por exemplo:

```text
"Java é uma linguagem de programação."
```

e verificar se contém:

- `Java`;
- `programação`;
- `Python`.

---

# 8. Normalização

Receba:

```text
"   MARIA SILVA   "
```

e produza:

```text
"maria silva"
```

Utilize métodos de `String`.

---

# 9. Substituição

Considere:

```text
"Eu estudo Python."
```

Crie uma nova String substituindo `Python` por `Java`.

A String original não deve ser alterada.

---

# 10. Validação de e-mail

Crie um método:

```java
static boolean emailValido(String email)
```

Para esta atividade, considere válido um e-mail que:

- não esteja vazio;
- não contenha apenas espaços;
- contenha `@`;
- contenha `.`.

Não é necessário implementar uma validação completa de e-mail.

---

# 11. Desafio — encontre os erros

Corrija:

```java
public class Desafio {

    public static void main(String[] args) {

        String nome = "Maria";

        if (nome == "Maria") {
            System.out.println("Nome correto");
        }

        System.out.println(nome.charAt(nome.length()));

        String texto = "Java";
        texto.toUpperCase();

        System.out.println(texto);
    }
}
```

Identifique todos os problemas e explique cada um.

---

# 12. Desafio final — cadastro textual

Crie um programa que receba:

- nome;
- e-mail;
- cidade.

O programa deve:

1. remover espaços extras das extremidades;
2. normalizar o nome;
3. verificar se o nome não está vazio;
4. verificar se o e-mail contém `@` e `.`;
5. verificar se a cidade foi informada;
6. exibir os dados normalizados.

Separe a solução em métodos.

Exemplo:

```java
normalizarNome()
emailValido()
campoPreenchido()
exibirCadastro()
```

**Observação:** arrays e `ArrayList` serão utilizados e aprofundados na Aula 07.
