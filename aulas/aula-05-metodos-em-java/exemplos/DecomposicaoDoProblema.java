public class DecomposicaoDoProblema {

    static int somar(int a, int b) {
        return a + b;
    }

    static int subtrair(int a, int b) {
        return a - b;
    }

    static int multiplicar(int a, int b) {
        return a * b;
    }

    static double calcularMedia(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    static void exibirResultados(int a, int b) {

        System.out.println("Soma: " + somar(a, b));
        System.out.println("Subtração: " + subtrair(a, b));
        System.out.println("Multiplicação: " + multiplicar(a, b));
    }

    public static void main(String[] args) {

        exibirResultados(10, 5);

        double media = calcularMedia(7, 8, 9);
        System.out.println("Média: " + media);
    }
}
