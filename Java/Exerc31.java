// Desenvolva um programa que dados três números inteiros, informe quantos são negativos.

package aula01;

import java.util.Scanner;

public class Exerc31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro número: ");
		num1 = input.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = input.nextInt();
		System.out.print("Digite o terceiro número: ");
		num3 = input.nextInt();
		
		// Somente um número negativo.
		
		if (num1 < 0 && num2 > 0 && num3 > 0) {
			System.out.printf("O número %d é negativo.", num1); }
		else if (num1 > 0 && num2 < 0 && num3 > 0) {
			System.out.printf("O número %d é negativo.", num2); }
		else if (num1 > 0 && num2 > 0 && num3 < 0) {
			System.out.printf("O número %d é negativo.", num3); }
		
		// Dois números negativos.
		
		else if (num1 < 0 && num2 < 0 && num3 > 0) {
			System.out.printf("Os números %d e %d são negativos.", num1, num2); }
		else if (num1 < 0 && num2 > 0 && num3 < 0) {
			System.out.printf("Os números %d e %d são negativos.", num1, num3); }
		else if (num1 > 0 && num2 < 0 && num3 < 0) {
			System.out.printf("Os números %d e %d são negativos.", num2, num3); }
		
		// Todos negativos.
		
		else if (num1 < 0 && num2 < 0 && num3 < 0) {
			System.out.printf("Todos os números são negativos."); }
		
		// Nenhum.
		
		else {
			System.out.print("Não há números negativos."); }
		
		input.close();
	}
}