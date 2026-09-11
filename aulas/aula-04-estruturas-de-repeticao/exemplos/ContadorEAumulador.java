public class ContadorEAumulador {

    public static void main(String[] args) {

        int contador = 0;
        int soma = 0;

        for (int numero = 1; numero <= 10; numero++) {
            contador++;
            soma += numero;
        }

        System.out.println("Quantidade de números: " + contador);
        System.out.println("Soma: " + soma);
    }
}
