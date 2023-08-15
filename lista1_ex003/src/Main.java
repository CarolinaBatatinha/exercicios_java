// Faça um algoritmo para ler dois números e fazer a troca dos valores digitados pelo usuário. Após a troca, imprima os novos valores obtidos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        int num2 = scanner.nextInt();

        int aux = num1;
        num1 = num2;
        num2 = aux;

        System.out.println("O primeiro número virou " + num1 +" e o segundo número virou "+num2+".");
    }
}
