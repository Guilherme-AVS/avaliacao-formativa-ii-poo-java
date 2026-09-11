public class MetodoComVariosParametros {

    static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    static boolean aprovado(double media) {
        return media >= 7.0;
    }

    public static void main(String[] args) {

        double media = calcularMedia(8.0, 7.5, 9.0);

        System.out.println("Média: " + media);
        System.out.println("Aprovado: " + aprovado(media));
    }
}
