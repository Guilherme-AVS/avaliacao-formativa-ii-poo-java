public class RemoverEspacos {

    public static void main(String[] args) {

        String texto = "   Java é divertido!   ";

        System.out.println("Original: [" + texto + "]");
        System.out.println("trim(): [" + texto.trim() + "]");
        System.out.println("strip(): [" + texto.strip() + "]");
    }
}
