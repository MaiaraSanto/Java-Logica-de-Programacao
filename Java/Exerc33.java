// Desenvolva um programa que dada a data de nascimento de uma pessoa e a data atual, informe a idade dessa pessoa em anos completos.

package aula01;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exerc33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		String dia, mes, ano;
		
		System.out.print("Digite o dia do seu nascimento: ");
		dia = input.next();
		System.out.print("Digite o mês do seu nascimento: ");
		mes = input.next();
		System.out.print("Digite o ano do seu nascimento: ");
		ano = input.next();
		
		int d = Integer.parseInt(dia);
		int m = Integer.parseInt(mes);
		int a = Integer.parseInt(ano);
		
		LocalDate localDateAntigo = LocalDate.of(a, m, d);
		LocalDate localDateNovo = LocalDate.now();

	    Period periodo = Period.between(localDateAntigo, localDateNovo);
	    System.out.println("Sua idade é de " + periodo.getYears() + " anos, " + periodo.getMonths()
	    + " meses e " + periodo.getDays() + " dias.");
	    
	    input.close();
	}
}