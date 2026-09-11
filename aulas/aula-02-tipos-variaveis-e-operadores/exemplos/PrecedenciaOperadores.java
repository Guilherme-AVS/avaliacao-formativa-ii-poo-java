public class PrecedenciaOperadores {

    public static void main(String[] args) {
        int resultado = 5 + 3 * 2;
        System.out.println("5 + 3 * 2 = " + resultado);

        boolean teste = 10 > 5 && 20 <= 30 || 4 == 4;
        System.out.println("10 > 5 && 20 <= 30 || 4 == 4 = " + teste);

        int x = 4 + 5 * 2 / 10;
        System.out.println("4 + 5 * 2 / 10 = " + x);

        int semParenteses = 5 + 3 * 2;
        int comParenteses = (5 + 3) * 2;

        System.out.println("Sem parênteses: " + semParenteses);
        System.out.println("Com parênteses: " + comParenteses);
    }
}
