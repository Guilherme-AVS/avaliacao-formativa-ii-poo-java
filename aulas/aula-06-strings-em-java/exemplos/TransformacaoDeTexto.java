public class TransformacaoDeTexto {

    public static void main(String[] args) {

        String texto = "Programação Orientada a Objetos";

        System.out.println("Original: " + texto);
        System.out.println("Maiúsculas: " + texto.toUpperCase());
        System.out.println("Minúsculas: " + texto.toLowerCase());

        // A String original não é modificada.
        System.out.println("Original novamente: " + texto);
    }
}
