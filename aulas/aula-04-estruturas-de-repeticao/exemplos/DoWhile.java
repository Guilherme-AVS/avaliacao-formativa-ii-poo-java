public class DoWhile {

    public static void main(String[] args) {
        int contador = 1;

        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 5);

        System.out.println();

        int valor = 10;

        do {
            System.out.println("Este bloco executa pelo menos uma vez.");
            valor++;
        } while (valor < 5);
    }
}
