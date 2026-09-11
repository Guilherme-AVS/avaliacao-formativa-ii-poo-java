public class SwitchExpression {

    public static void main(String[] args) {
        int dia = 3;

        String tipo = switch (dia) {
            case 1, 7 -> "Fim de semana";
            case 2, 3, 4, 5, 6 -> "Dia útil";
            default -> "Dia inválido";
        };

        System.out.println(tipo);
    }
}
