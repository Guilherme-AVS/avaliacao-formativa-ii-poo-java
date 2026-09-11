public class ParametrosEArgumentos {

    static void saudar(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    public static void main(String[] args) {
        String nomeAluno = "Ana";

        saudar(nomeAluno);
        saudar("Carlos");
    }
}
