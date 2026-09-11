class Aluno {

    String nome;
    double nota;

    Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
}

public class ArrayDeObjetos {

    public static void main(String[] args) {

        Aluno[] alunos = {
            new Aluno("Ana", 8.5),
            new Aluno("Bruno", 7.0),
            new Aluno("Carla", 9.2)
        };

        for (Aluno aluno : alunos) {
            System.out.println(aluno.nome + " - " + aluno.nota);
        }
    }
}
