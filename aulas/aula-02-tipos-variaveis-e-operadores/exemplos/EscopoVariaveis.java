public class EscopoVariaveis {

    private String nome = "Maria";       // variável de instância
    private int idade = 20;              // variável de instância

    private static int total = 0;        // variável de classe

    public void demonstrarEscopoLocal() {
        int x = 10;                      // variável local

        if (x > 5) {
            int y = 20;                  // escopo limitado ao if
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }

        System.out.println("x ainda existe: " + x);
        // y não pode ser acessada aqui.
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void incrementarTotal() {
        total++;
        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {
        EscopoVariaveis pessoa = new EscopoVariaveis();

        pessoa.demonstrarEscopoLocal();
        pessoa.exibirDados();

        incrementarTotal();
        incrementarTotal();
    }
}
