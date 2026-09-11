public class DeclaracaoEConcatenacao {

    public static void main(String[] args) {

        String nome = "Maria";
        String sobrenome = "Silva";

        String nomeCompleto = nome + " " + sobrenome;

        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Nome completo: " + nomeCompleto);

        String mensagem = "Olá, " + nome + "!";
        System.out.println(mensagem);
    }
}
