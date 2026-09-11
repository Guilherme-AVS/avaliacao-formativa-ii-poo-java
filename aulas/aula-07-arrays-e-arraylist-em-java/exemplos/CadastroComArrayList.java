import java.util.ArrayList;

public class CadastroComArrayList {

    static void adicionarAluno(ArrayList<String> alunos, String nome) {
        alunos.add(nome);
    }

    static void listarAlunos(ArrayList<String> alunos) {

        for (String aluno : alunos) {
            System.out.println("- " + aluno);
        }
    }

    static boolean buscarAluno(ArrayList<String> alunos, String nome) {
        return alunos.contains(nome);
    }

    static void removerAluno(ArrayList<String> alunos, String nome) {
        alunos.remove(nome);
    }

    public static void main(String[] args) {

        ArrayList<String> alunos = new ArrayList<>();

        adicionarAluno(alunos, "Ana");
        adicionarAluno(alunos, "Bruno");
        adicionarAluno(alunos, "Carla");

        System.out.println("Alunos:");
        listarAlunos(alunos);

        System.out.println();
        System.out.println("Bruno está cadastrado? "
                + buscarAluno(alunos, "Bruno"));

        removerAluno(alunos, "Bruno");

        System.out.println();
        System.out.println("Após remover Bruno:");
        listarAlunos(alunos);
    }
}
