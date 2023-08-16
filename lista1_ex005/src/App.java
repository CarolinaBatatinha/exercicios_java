
// Faça um algoritmo que leia um número inteiro e imprima seu dobro e sua metade.
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        double num = scanner.nextDouble();

        double dobro = num * 2;
        double metade = num / 2;

        System.out.println("O dobro de " + num + " é igual a " + dobro + " e a metade de " + num + " é igual a " + metade + ".");
    }
}
