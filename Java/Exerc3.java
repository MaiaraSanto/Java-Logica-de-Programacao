// Escreva um programa que entre com um número e o imprima caso seja maior do que 20. 

package aula01;

import java.util.Scanner;

public class Exerc3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um número:");
		x = input.nextInt();
		
		if (x > 20) {
			System.out.print("o número " + x + " é maior do que 20");
		}
		
		else {
			System.out.print("o número " + x + " é menor do que 20");
		}

		input.close();
	}
}