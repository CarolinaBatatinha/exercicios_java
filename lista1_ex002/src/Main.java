// Faça um algoritmo para ler quatro notas e imprimir a média ponderada dessas notas. Considere que os pesos das são: 1, 2, 3 e 4, respectivamente.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nInforme a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Informe a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Informe a quarta nota: ");
        double nota4 = scanner.nextDouble();

        int peso1 = 1;
        int peso2 = 2;
        int peso3 = 3;
        int peso4 = 4;

        double mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) + (nota4 * peso4)) / (peso1 + peso2 + peso3 + peso4);

        System.out.println("\nMédia ponderada: " + mediaPonderada);
    }
}
