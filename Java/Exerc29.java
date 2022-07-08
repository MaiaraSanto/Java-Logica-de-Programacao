// Desenvolva um programa que dado um número, imprima uma das mensagens: é múltiplo de 3 ou não é múltiplo de 3. 

package aula01;

import java.util.Scanner;

public class Exerc29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int num; 
		
		System.out.print("Digite o número: ");
		num = input.nextInt();
		
		if (num % 3 == 0) {
			System.out.print("O número " + num + " é múltiplo de 3.");
		}
		
		else {
			System.out.print("O número " + num + " não é múltiplo de 3.");
		}
		
		input.close();
	}
}