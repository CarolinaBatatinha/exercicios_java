// Desenvolva um programa para cálculo de salário liquido de um funcionário O programa deve:
// • Pedir o salário bruto do funcionário
// • Calcular o valor do IR com alíquota de 10%
// • Calcular o valor do INSS com alíquota de 5%
// • Calcular o salário liquido do funcionário

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salário bruto em R$: ");
        double salarioBruto = scanner.nextDouble();

        scanner.close();
        
        double valorIR = salarioBruto * .10;

        double valorINSS = salarioBruto * .05;

        double salarioLiquido = salarioBruto - valorIR - valorINSS;

        System.out.printf("O valor do salário líquido é de R$ %.2f", salarioLiquido);
    }
}
