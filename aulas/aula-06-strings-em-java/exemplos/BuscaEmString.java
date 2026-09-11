public class BuscaEmString {

    public static void main(String[] args) {

        String texto = "Java e Programação Orientada a Objetos";

        int primeiraOcorrencia = texto.indexOf("a");
        int ultimaOcorrencia = texto.lastIndexOf("a");

        System.out.println("Primeira ocorrência de 'a': "
                + primeiraOcorrencia);

        System.out.println("Última ocorrência de 'a': "
                + ultimaOcorrencia);

        System.out.println("Posição de 'Java': "
                + texto.indexOf("Java"));
    }
}
