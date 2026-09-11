public class IncrementoDecremento {

    public static void main(String[] args) {
        int a = 5;

        System.out.println("Pós-incremento: " + a++);
        System.out.println("Depois do pós-incremento: " + a);

        int b = 10;

        System.out.println("Pré-incremento: " + ++b);
        System.out.println("Depois do pré-incremento: " + b);

        int c = 5;

        System.out.println("Pós-decremento: " + c--);
        System.out.println("Depois do pós-decremento: " + c);

        int d = 10;

        System.out.println("Pré-decremento: " + --d);
        System.out.println("Depois do pré-decremento: " + d);
    }
}
