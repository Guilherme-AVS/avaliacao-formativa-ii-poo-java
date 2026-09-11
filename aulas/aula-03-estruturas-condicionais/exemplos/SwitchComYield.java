public class SwitchComYield {

    public static void main(String[] args) {
        int nota = 8;

        String conceito = switch (nota) {
            case 10, 9 -> {
                yield "Excelente";
            }
            case 8, 7 -> {
                yield "Bom";
            }
            case 6, 5 -> {
                yield "Regular";
            }
            default -> {
                yield "Insuficiente";
            }
        };

        System.out.println("Conceito: " + conceito);
    }
}
