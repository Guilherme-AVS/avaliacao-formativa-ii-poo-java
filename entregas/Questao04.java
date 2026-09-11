import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;
        double maior = 0;
        double menor = 0;
        int aprovados = 0;

        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            
            soma += notas[i];

        
            if (i == 0) {
                maior = notas[i];
                menor = notas[i];
            } else {
                if (notas[i] > maior) maior = notas[i];
                if (notas[i] < menor) menor = notas[i];
            }

            if (notas[i] >= 7.0) aprovados++;
        }

        
        
        System.out.println("\n--- Resultado ---");
        System.out.print("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println("\nMédia: " + (soma / notas.length));
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Estudantes com nota >= 7.0: " + aprovados);

        
        
        scanner.close();
    }
}
