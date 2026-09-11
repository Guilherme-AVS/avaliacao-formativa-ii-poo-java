import java.util.ArrayList;

public class DesafioEncontreErros {

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30};

        // O último índice é 2.
        System.out.println(numeros[2]);

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Bruno");

        // ArrayList utiliza get() para acessar elementos.
        System.out.println(nomes.get(0));

        // ArrayList utiliza size() para obter a quantidade de elementos.
        System.out.println(nomes.size());
    }
}
