public class Constantes {

    public static void main(String[] args) {
        final double PI = 3.14159;
        final int DIAS_SEMANA = 7;
        final String CURSO = "Ciência da Computação";

        System.out.println("PI: " + PI);
        System.out.println("Dias da semana: " + DIAS_SEMANA);
        System.out.println("Curso: " + CURSO);

        // Uma constante não pode receber outro valor depois de inicializada.
        // PI = 3.14; // Erro de compilação
    }
}
