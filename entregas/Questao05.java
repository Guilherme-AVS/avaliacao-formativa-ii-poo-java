public class Questao05 {
    public static void main(String[] args) {
        
        // Criando o primeiro aluno usando o construtor
        System.out.println("--- Aluno 1 ---");
        Aluno aluno1 = new Aluno("Ana Souza", "20260001", "Ciência da Computação");
        aluno1.exibirDados();

        // Criando o segundo aluno usando o construtor
        System.out.println("\n--- Aluno 2 ---");
        Aluno aluno2 = new Aluno("Pedro Lima", "20260002", "Engenharia da Computação");
        aluno2.exibirDados();
    }
}
    

