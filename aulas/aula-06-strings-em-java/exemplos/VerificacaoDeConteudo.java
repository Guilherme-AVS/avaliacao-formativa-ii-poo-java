public class VerificacaoDeConteudo {

    public static void main(String[] args) {

        String email = "aluno@unic ap.br".replace(" ", "");

        System.out.println("Contém @: " + email.contains("@"));
        System.out.println("Começa com aluno: " + email.startsWith("aluno"));
        System.out.println("Termina com .br: " + email.endsWith(".br"));

        String vazio = "";
        String somenteEspacos = "   ";

        System.out.println("String vazia: " + vazio.isEmpty());
        System.out.println("Somente espaços em branco: "
                + somenteEspacos.isBlank());
    }
}
