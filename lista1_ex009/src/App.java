// Desenvolva um algoritmo que:
// • Peca o valor do produto
// • Peca a valor da aliquota
// • Calcule o valor em reais da porcentagem informada.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto em reais: ");
        double valorProduto = scanner.nextDouble();
        System.out.println("Digite o valor da alíquota: ");
        double aliquota = scanner.nextDouble();
        scanner.close();

        double valorAliquota = ((valorProduto * aliquota) / 100);
        System.out.printf("O valor da alíquota é de R$ %.2f", valorAliquota);

    }
}
