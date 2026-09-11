import java.util.ArrayList;

public class OperacoesArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("Lista: " + numeros);
        System.out.println("Primeiro: " + numeros.get(0));

        numeros.set(1, 25);
        System.out.println("Após set: " + numeros);

        numeros.remove(0);
        System.out.println("Após remove: " + numeros);

        System.out.println("Tamanho: " + numeros.size());
        System.out.println("Contém 30: " + numeros.contains(30));
    }
}
