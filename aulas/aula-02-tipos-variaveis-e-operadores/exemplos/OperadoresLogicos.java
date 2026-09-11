public class OperadoresLogicos {

    public static void main(String[] args) {
        int idade = 25;
        boolean temCarteira = true;

        boolean podeDirigir = idade >= 18 && temCarteira;
        boolean precisaEstudar = idade < 18 || !temCarteira;

        System.out.println("Pode dirigir: " + podeDirigir);
        System.out.println("Precisa estudar: " + precisaEstudar);

        System.out.println();
        System.out.println("Tabela AND:");
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));

        System.out.println();
        System.out.println("Tabela OR:");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));
    }
}
