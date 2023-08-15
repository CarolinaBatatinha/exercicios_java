//Faça um algoritmo para ler um número, somá-lo com o valor 10 e mostrar a média entre o número lido e o valor 10.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = scanner.nextDouble();

        double soma = numero + 10;
        double media = soma / 2;

        System.out.println("Número lido: " + numero);
        System.out.println("Valor somado: " + soma);
        System.out.println("Média: " + media);
    }
}
