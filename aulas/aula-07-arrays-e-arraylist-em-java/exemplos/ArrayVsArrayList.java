import java.util.ArrayList;

public class ArrayVsArrayList {

    public static void main(String[] args) {

        int[] array = {10, 20, 30};

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);

        System.out.println("Array:");
        System.out.println("Quantidade: " + array.length);
        System.out.println("Primeiro: " + array[0]);

        System.out.println();

        System.out.println("ArrayList:");
        System.out.println("Quantidade: " + lista.size());
        System.out.println("Primeiro: " + lista.get(0));
    }
}
