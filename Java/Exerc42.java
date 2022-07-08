// Faça um programa para calcular a tabuada de qualquer número digitado pelo usuário.

package aula01;

import java.util.Scanner;

public class Exerc42 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x, i;
		
		do {
			System.out.print("Digite um valor maior do que 0: ");
			x = input.nextInt();
		} while (x <= 0);
		
		input.close();
		
		for (i = 1; i <= 10; i++) {
			System.out.print(+ x + " * " + i + " = " + (x * i) + "\n");
		}
		
	}
}