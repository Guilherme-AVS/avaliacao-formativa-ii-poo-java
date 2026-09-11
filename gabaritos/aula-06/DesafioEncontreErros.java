public class DesafioEncontreErros {

    public static void main(String[] args) {

        String nome = "Maria";

        // Correção:
        // equals() deve ser usado para comparar o conteúdo.
        if (nome.equals("Maria")) {
            System.out.println("Nome correto");
        }

        // Correção:
        // O último índice é length() - 1.
        System.out.println(nome.charAt(nome.length() - 1));

        String texto = "Java";

        // Correção:
        // String é imutável; é necessário guardar o resultado.
        texto = texto.toUpperCase();

        System.out.println(texto);
    }
}
