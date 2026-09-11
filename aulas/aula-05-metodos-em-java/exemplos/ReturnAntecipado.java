public class ReturnAntecipado {

    static void verificarIdade(int idade) {

        if (idade < 0) {
            System.out.println("Idade inválida.");
            return;
        }

        if (idade >= 18) {
            System.out.println("Maior de idade.");
            return;
        }

        System.out.println("Menor de idade.");
    }

    public static void main(String[] args) {
        verificarIdade(20);
        verificarIdade(15);
        verificarIdade(-1);
    }
}
