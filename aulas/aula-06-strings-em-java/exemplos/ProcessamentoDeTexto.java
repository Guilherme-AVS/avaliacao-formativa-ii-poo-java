public class ProcessamentoDeTexto {

    static String normalizarNome(String nome) {

        return nome
                .strip()
                .toLowerCase()
                .replace("  ", " ");
    }

    static boolean emailValido(String email) {

        return email != null
                && !email.isBlank()
                && email.contains("@")
                && email.contains(".");
    }

    public static void main(String[] args) {

        String nome = "   Maria   Silva  ";
        String email = "maria@email.com";

        System.out.println("Nome normalizado: " + normalizarNome(nome));
        System.out.println("E-mail válido: " + emailValido(email));
    }
}
