import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome completo: ");
        String nomeCompleto = scanner.nextLine();

        int qtdCaracteres = quantidadeCaracteres(nomeCompleto);
        String nomeMaiusculo = formatarNome(nomeCompleto);
        boolean possuiSilva = contemSilva(nomeCompleto);

        System.out.println("\nQuantidade de caracteres: " + qtdCaracteres);
        System.out.println("Nome em maiúsculas: " + nomeMaiusculo);
        System.out.println("Contém \"Silva\": " + possuiSilva);

        scanner.close();
    }

    public static int quantidadeCaracteres(String texto) {
        return texto.length();
    }

    public static String formatarNome(String nome) {
        return nome.toUpperCase();
    }

    public static boolean contemSilva(String nome) {
        return nome.contains("Silva");
    }
}
    

