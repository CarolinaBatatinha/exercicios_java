import java.util.Scanner;

// Faça um algoritmo para ler dois números e realizar as operações aritméticas: adição, subtração e multiplicação.
// Para cada operação o resultado deve ser impresso no vídeo.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println(num1+ " + "+ num2 + " = " + soma);
        System.out.println(num1+ " - "+ num2 + " = " + subtracao);
        System.out.println(num1+ " x "+ num2 + " = " + multiplicacao);
        System.out.println(num1+ " ÷ "+ num2 + " = " + divisao);
    }
}
