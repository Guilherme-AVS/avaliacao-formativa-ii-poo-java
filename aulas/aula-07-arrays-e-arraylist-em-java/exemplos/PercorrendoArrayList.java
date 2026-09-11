import java.util.ArrayList;

public class PercorrendoArrayList {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");

        System.out.println("Com for:");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println();
        System.out.println("Com for-each:");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
