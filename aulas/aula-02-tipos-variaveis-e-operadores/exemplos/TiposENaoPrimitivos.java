public class TiposNaoPrimitivos {

    public static void main(String[] args) {
        String nome = "Maria";

        int[] numeros = {1, 2, 3, 4, 5};

        Pessoa pessoa = new Pessoa("Maria");

        System.out.println("String: " + nome);
        System.out.println("Primeiro elemento do array: " + numeros[0]);
        System.out.println("Objeto: " + pessoa.getNome());
    }

    static class Pessoa {
        private String nome;

        Pessoa(String nome) {
            this.nome = nome;
        }

        String getNome() {
            return nome;
        }
    }
}
