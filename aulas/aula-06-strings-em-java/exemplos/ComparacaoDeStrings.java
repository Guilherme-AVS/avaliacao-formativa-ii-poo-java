public class ComparacaoDeStrings {

    public static void main(String[] args) {

        String senhaDigitada = "Java123";
        String senhaCorreta = "Java123";

        System.out.println("Senhas iguais: "
                + senhaDigitada.equals(senhaCorreta));

        String resposta = "SIM";

        System.out.println("Resposta afirmativa: "
                + resposta.equalsIgnoreCase("sim"));

        // Para comparar o conteúdo de Strings, prefira equals().
    }
}
