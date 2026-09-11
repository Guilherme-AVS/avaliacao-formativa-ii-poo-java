public class Substring {

    public static void main(String[] args) {

        String texto = "Programacao Orientada a Objetos";

        String inicio = texto.substring(0, 12);
        String parte = texto.substring(13, 22);

        System.out.println("Texto: " + texto);
        System.out.println("Início: " + inicio);
        System.out.println("Parte: " + parte);
    }
}
