public class CondicoesCompostas {

    public static void main(String[] args) {
        int idade = 22;
        boolean temCarteira = true;

        if (idade >= 18 && temCarteira) {
            System.out.println("Pode dirigir.");
        }

        int nota = 8;

        if (nota >= 7 || nota == 10) {
            System.out.println("A condição foi satisfeita.");
        }

        boolean bloqueado = false;

        if (!bloqueado) {
            System.out.println("Usuário liberado.");
        }

        int temperatura = 25;

        if (temperatura >= 20 && temperatura <= 30) {
            System.out.println("Temperatura confortável.");
        }
    }
}
