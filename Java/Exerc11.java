// Faça um programa que receba um número inteiro entre 1 e 7 e informe o dia da semana correspondente (1 = domingo, 2 = segunda).

package aula01;

import java.util.Scanner;

public class Exerc11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int num;
		
		System.out.print("Digite o número do dia da semana desejado: ");
		num = input.nextInt();
		
		switch (num) {
			case 1: 
				System.out.println("O dia é domingo!");
			break;
			
			case 2: 
				System.out.println("O dia é segunda-feira!");
			break;
		
			case 3: 
				System.out.println("O dia é terça-feira!");
			break;
			
			case 4: 
				System.out.println("O dia é quarta-feira!");
			break;
			
			case 5: 
				System.out.println("O dia é quinta-feira!");
			break;
			
			case 6: 
				System.out.println("O dia é sexta-feira!");
			break;
			
			case 7: 
				System.out.println("O dia é sábado!");
			break;
		
			default:
				System.out.println("Não existe um dia correspondente a este número! Escolha de 1 a 7.");
		}
				
		input.close();
	}
}