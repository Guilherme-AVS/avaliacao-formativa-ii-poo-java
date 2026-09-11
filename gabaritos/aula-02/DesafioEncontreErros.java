public class DesafioEncontreErros {

    public static void main(String[] args) {

        // Erro 1 corrigido:
        int numero = 42;

        // Erro 2 corrigido:
        // Pelo menos um operando deve ser decimal para obter 3.333...
        double resultado = 10.0 / 3;
        System.out.println("Resultado preciso: " + resultado);

        // Erro 3 corrigido:
        boolean teste = 5 + 10 > 10;

        // Erro 4 corrigido:
        int contador = 1;
        if (contador == 1) {
            System.out.println("Contador é 1");
        }

        // Erro 5 corrigido:
        String a = "abc";
        String b = "abc";

        if (a.equals(b)) {
            System.out.println("Strings iguais");
        }

        System.out.println("Número: " + numero);
        System.out.println("Teste: " + teste);
    }
}
