public class Variaveis {

    public static void main(String[] args) {
        int idade;
        idade = 20;

        double salario = 3500.50;
        boolean aprovado = true;
        String nome = "João";

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Aprovado: " + aprovado);

        idade = 21;
        nome = "João Silva";

        System.out.println("Depois da atribuição:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        int a, b, c;
        a = b = c = 100;

        System.out.println("Atribuição múltipla:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
