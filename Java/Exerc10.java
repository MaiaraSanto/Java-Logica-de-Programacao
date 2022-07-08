// Criar um programa que leia pelo teclado um valor inteiro e diga se é par ou ímpar.

package aula01;

import java.util.Scanner;

public class Exerc10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int num; 
		
		System.out.print("Digite o número: ");
		num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.print("o número " + num + " é par");
		}
		
		else {
			System.out.print("o número " + num + " é ímpar");
		}
		
		input.close();
	}
}