public class ArrayDeStrings {

    public static void main(String[] args) {

        String[] linguagens = {
            "Java",
            "Python",
            "C",
            "JavaScript"
        };

        for (int i = 0; i < linguagens.length; i++) {
            System.out.println((i + 1) + " - " + linguagens[i]);
        }
    }
}
