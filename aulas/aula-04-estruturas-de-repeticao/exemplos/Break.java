public class Break {

    public static void main(String[] args) {

        for (int numero = 1; numero <= 10; numero++) {

            if (numero == 6) {
                break;
            }

            System.out.println(numero);
        }

        System.out.println("Loop encerrado.");
    }
}
