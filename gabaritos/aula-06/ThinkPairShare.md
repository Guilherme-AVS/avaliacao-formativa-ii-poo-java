# Gabarito — Think-Pair-Share — Aula 06

## Questão 1

Para:

```java
String nome = "Ana";
```

temos:

```java
nome.length()
```

Resultado:

```text
3
```

A String possui três caracteres: `A`, `n` e `a`.

---

## Questão 2

`equals()` compara o conteúdo das Strings:

```java
nome.equals(outroNome)
```

O operador `==`, quando aplicado a objetos, verifica se as referências são iguais.

Para comparar o conteúdo de Strings, deve-se utilizar `equals()` ou, quando apropriado, `equalsIgnoreCase()`.

Exemplo:

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a.equals(b)); // true
```

---

## Questão 3

O resultado não será `JAVA`.

O código:

```java
String texto = "java";
texto.toUpperCase();
```

produz uma nova String, mas o resultado não foi atribuído novamente à variável.

Portanto:

```java
System.out.println(texto);
```

continua exibindo:

```text
java
```

Para armazenar o resultado:

```java
texto = texto.toUpperCase();
```

Agora `texto` contém:

```text
JAVA
```

---

## Conceito principal

Strings em Java são imutáveis.

Isso significa que operações como:

```java
toUpperCase()
replace()
trim()
substring()
```

não modificam a String existente. Elas produzem uma nova String.

Por isso, quando queremos guardar o resultado, fazemos:

```java
texto = texto.toUpperCase();
```
