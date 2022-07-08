// Faça um programa que receba um número inteiro entre 1 e 12 e informe o mês correspondente (1 = janeiro, 2 = fevereiro),

package aula01;

import java.util.Scanner;

public class Exerc12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int num;
		
		System.out.print("Digite o número do mês desejado: ");
		num = input.nextInt();
		
		switch (num) {
			case 1: 
				System.out.println("O mês é Janeiro!");
			break;
			
			case 2: 
				System.out.println("O mês é Fevereiro!");
			break;
		
			case 3: 
				System.out.println("O mês é Março!");
			break;
			
			case 4: 
				System.out.println("O mês é Abril!");
			break;
			
			case 5: 
				System.out.println("O mês é Maio!");
			break;
			
			case 6: 
				System.out.println("O mês é Junho!");
			break;
			
			case 7: 
				System.out.println("O mês é Julho!");
			break;
			
			case 8: 
				System.out.println("O mês é Agosto!");
			break;
			
			case 9: 
				System.out.println("O mês é Setembro!");
			break;
			
			case 10: 
				System.out.println("O mês é Outubro!");
			break;
			
			case 11: 
				System.out.println("O mês é Novembro!");
			break;
			
			case 12: 
				System.out.println("O mês é Dezembro!");
			break;
			
			default:
				System.out.println("Não existe um mês correspondente a este número! Escolha de 1 a 12.");
		}
		
		input.close();
	}
}