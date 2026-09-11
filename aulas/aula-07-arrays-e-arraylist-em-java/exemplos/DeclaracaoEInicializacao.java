public class DeclaracaoEInicializacao {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        int[] outrosNumeros = {1, 2, 3, 4, 5};

        System.out.println("Primeiro array:");
        System.out.println(numeros[0]);

        System.out.println("Segundo array:");
        System.out.println(outrosNumeros[0]);
    }
}
