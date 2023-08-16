// Faça um programa para calcular o cubo de um número informado pelo usuário. Em seguida, faça a diferença desse resultado com o número lido.
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double cubo = Math.pow(numero,3);

        double resultado = cubo - numero;

        System.out.println(numero+"³ = " + cubo);
        System.out.println("O resultado da diferença entre "+numero+"³ e "+numero+ " é igual a "+resultado+".");
    }
}
