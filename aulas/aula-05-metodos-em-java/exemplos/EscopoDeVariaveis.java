public class EscopoDeVariaveis {

    static void mostrarNumero() {
        int numeroLocal = 10;
        System.out.println("Dentro do método: " + numeroLocal);
    }

    public static void main(String[] args) {

        int numero = 20;

        System.out.println("No main: " + numero);

        mostrarNumero();

        // numeroLocal não pode ser acessada aqui,
        // pois pertence ao escopo de mostrarNumero().
    }
}
