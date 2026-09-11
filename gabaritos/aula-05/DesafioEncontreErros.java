public class DesafioEncontreErros {

    // Erro 1 corrigido:
    // O método declara retorno int, portanto precisa retornar um int.
    static int calcular(int a, int b) {
        return a + b;
    }

    // Erro 2 corrigido:
    // O método é void e não pode retornar uma String.
    static void apresentar(String nome) {
        System.out.println(nome);
    }

    // Erro 3 corrigido:
    // A expressão precisa ser retornada.
    static int dobro(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {

        // Erro 4 corrigido:
        // O método calcular exige dois argumentos.
        System.out.println(calcular(10, 5));

        // Erro 5 corrigido:
        // O método apresentar exige um argumento String.
        apresentar("Maria");

        // Erro 6 corrigido:
        // O método dobro exige um argumento int.
        System.out.println(dobro(7));
    }
}
