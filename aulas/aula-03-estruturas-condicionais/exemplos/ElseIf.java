public class ElseIf {

    public static void main(String[] args) {
        double media = 7.5;

        if (media >= 9.0) {
            System.out.println("Excelente.");
        } else if (media >= 7.0) {
            System.out.println("Aprovado.");
        } else if (media >= 5.0) {
            System.out.println("Exame.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
