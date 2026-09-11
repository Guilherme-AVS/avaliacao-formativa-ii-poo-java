public class TamanhoECaracteres {

    public static void main(String[] args) {

        String palavra = "Java";

        System.out.println("Texto: " + palavra);
        System.out.println("Quantidade de caracteres: " + palavra.length());

        System.out.println("Primeiro caractere: " + palavra.charAt(0));
        System.out.println("Último caractere: " + palavra.charAt(palavra.length() - 1));
    }
}
