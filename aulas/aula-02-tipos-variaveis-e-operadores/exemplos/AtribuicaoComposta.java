public class AtribuicaoComposta {

    public static void main(String[] args) {
        int x = 10;
        x += 5;
        System.out.println("x += 5: " + x);

        int y = 20;
        y -= 8;
        System.out.println("y -= 8: " + y);

        int z = 3;
        z *= 4;
        System.out.println("z *= 4: " + z);

        int w = 15;
        w /= 3;
        System.out.println("w /= 3: " + w);

        int m = 17;
        m %= 5;
        System.out.println("m %= 5: " + m);
    }
}
