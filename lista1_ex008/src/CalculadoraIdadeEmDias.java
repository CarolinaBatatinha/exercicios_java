// Desenvolva um algoritmo que:
// • Peca o ano de nascimento.
// • Calcule a idade em dias.
// • Mostre a idade calculada.

import java.util.Calendar;
import java.util.Scanner;

public class CalculadoraIdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pede o ano de nascimento
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        
        // Obtém o ano atual
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        
        int diasPorAno = 365;
        
        int idadeEmDias = (anoAtual - anoNascimento) * diasPorAno;
        
        System.out.println("Sua idade em dias é: " + idadeEmDias + " dias");
        
        // Fecha o scanner
        scanner.close();
    }
}
