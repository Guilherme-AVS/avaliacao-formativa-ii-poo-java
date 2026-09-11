public class DesafioEncontreErros {

    public static void main(String[] args) {

        int idade = 20;

        // Erro 1 corrigido:
        // Para comparação, utilizamos ==.
        if (idade == 18) {
            System.out.println("Tem 18 anos.");
        }

        int dia = 2;

        // Erro 2 corrigido:
        // Cada case deve possuir break quando não desejamos
        // executar os próximos cases.
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            default:
                System.out.println("Outro dia");
        }

        int nota = 8;

        // Erro 3 corrigido:
        // As chaves delimitam os comandos pertencentes ao if/else.
        if (nota >= 7) {
            System.out.println("Aprovado");
            System.out.println("Parabéns!");
        } else {
            System.out.println("Reprovado");
        }
    }
}
