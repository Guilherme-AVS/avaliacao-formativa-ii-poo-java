public class Imutabilidade {

    public static void main(String[] args) {

        String texto = "java";

        texto.toUpperCase();

        System.out.println("Após toUpperCase() sem atribuição: " + texto);

        texto = texto.toUpperCase();

        System.out.println("Após atribuir o resultado: " + texto);
    }
}
