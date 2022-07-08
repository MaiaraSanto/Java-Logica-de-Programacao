// Faça um programa para calcular a área de um triângulo e que não permita a entrada de dados inválidos, ou seja, medidas menores ou iguais a zero.

package aula01;

import java.util.Scanner;

public class Exerc48 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float base, altura;
		
		do {
			System.out.print("Informe a base do triângulo: ");
			base = input.nextFloat();
			
			System.out.print("Informe a altura do triângulo: ");
			altura = input.nextFloat();
			
			if (base <= 0 || altura <= 0) {
				System.out.print("\nEntrada inválida!\n");
			}
		} while (base <= 0 || altura <= 0);
		
		System.out.print("\nÁrea do triângulo: " + (base*altura)/2 + " cm².");
		
		input.close();
	}
}