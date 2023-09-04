// 10. Faca um algoritmo que:
// • Peca o valor a prazo do produto
// • Peca a alíquota do desconto
// • Calcule o preço a vista do produto

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do produto à prazo: ");
        double valorPrazo = scanner.nextDouble();
        System.out.println("Informe a alíquota do desconto: ");
        double desconto = scanner.nextDouble();
        scanner.close();

        double valorDesconto = (desconto / 100) * valorPrazo;
        double valorAVista = valorPrazo - valorDesconto;
        
        System.out.printf("O valor do produto a vista é de R$ %.2f", valorAVista);
    }
}
