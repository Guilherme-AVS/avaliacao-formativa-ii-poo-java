public class AcessoEAlteracao {

    public static void main(String[] args) {

        int[] notas = {7, 8, 6, 9, 10};

        System.out.println("Nota inicial: " + notas[2]);

        notas[2] = 7;

        System.out.println("Nota após alteração: " + notas[2]);
        System.out.println("Quantidade de notas: " + notas.length);
    }
}
