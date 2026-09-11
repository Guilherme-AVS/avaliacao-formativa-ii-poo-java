public class Tabuada {

    public static void main(String[] args) {

        int numero = 7;

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            int resultado = numero * multiplicador;

            System.out.println(
                numero + " x " + multiplicador + " = " + resultado
            );
        }
    }
}
