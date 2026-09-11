public class OperadorTernario {

    public static void main(String[] args) {
        int idade = 20;

        String situacao = idade >= 18
                ? "Maior de idade"
                : "Menor de idade";

        System.out.println(situacao);

        double media = 7.5;

        String resultado = media >= 7
                ? "Aprovado"
                : "Não aprovado";

        System.out.println(resultado);
    }
}
