public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão inteira: " + divisao);
        System.out.println("Resto: " + resto);

        int x = 5 / 2;
        double y = 5 / 2;
        double z = 5.0 / 2;

        System.out.println("5 / 2 como int: " + x);
        System.out.println("5 / 2 atribuído a double: " + y);
        System.out.println("5.0 / 2 como double: " + z);
    }
}
