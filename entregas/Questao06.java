public class Questao06 {
    public static void main(String[] args) {
        System.out.println("--- Dados iniciais ---");
        Aluno aluno1 = new Aluno("Ana Souza", "20260001", "Ciência da Computação");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Curso: " + aluno1.getCurso());

        System.out.println("\nAlterando o curso...");
        aluno1.setCurso("Sistemas de Informação");
        System.out.println("Curso alterado com sucesso.");

        System.out.println("\nTentando alterar o nome para vazio...");
        aluno1.setNome(""); 

        System.out.println("\n--- Dados finais ---");
        aluno1.exibirDados();
    }
}
