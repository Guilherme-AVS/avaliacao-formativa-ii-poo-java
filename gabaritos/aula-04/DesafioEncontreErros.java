public class DesafioEncontreErros {

    public static void main(String[] args) {

        int contador = 1;

        // Erro 1 corrigido:
        // O contador precisa ser atualizado para que a condição
        // deixe de ser verdadeira.
        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        // Erro 2 corrigido:
        // i deve ser incrementado, pois a condição é i < 10.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int numero = 10;

        do {
            System.out.println(numero);
            numero++;
        } while (numero < 10);

        // Este do-while executa uma vez, mesmo que a condição
        // inicial já seja falsa.

        for (int i = 1; i <= 10; i++) {

            // Erro 3 corrigido:
            // Não deve existir ; depois do if.
            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}
