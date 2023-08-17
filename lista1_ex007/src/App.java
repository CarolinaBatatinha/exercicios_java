// 7. Desenvolva um programa para resolver as seguintes equações:
// • x*y
// • x²+y (para fazer x2, use: x*x ou x^2)
// • (4/r) * (w+r)

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite um valor para x: ");
    int x = scanner.nextInt();
    System.out.println("Digite um valor para y: ");
    int y = scanner.nextInt();
    System.out.println("Digite um valor para r: ");
    int r = scanner.nextInt();
    System.out.println("Digite um valor para w: ");
    int w = scanner.nextInt();

    double result1 = x * y;
    double result2 = Math.pow(x, 2) + y;
    double result3 = (4 / r) * (w + r);

    System.out.println(x + " x " + y + " = " + result1);
    System.out.println(x + "² + " + y + " = " + result2);
    System.out.println("(4 / "+r+") * ("+w+" + "+r+") = " + result3);

    }
}