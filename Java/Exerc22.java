// Escreva um programa para ler 3 valores inteiros (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

package aula01;

import java.util.Scanner;

public class Exerc22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro valor: ");
		num1 = input.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		num2 = input.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		num3 = input.nextInt();
		
		if ((num1 > num2) && (num1 > num3)) {
			if (num2 > num3) {
				System.out.printf("A ordem crescente é: \n%d \n%d \n%d", num3, num2, num1); }
			
			else {
				System.out.printf("A ordem crescente é: \n%d \n%d \n%d", num2, num3, num1); }
		}
		
		else if ((num2 > num1) && (num2 > num3)) {
			if (num1 > num3) {
				System.out.printf("A ordem crescente é: \n%d \n%d \n%d", num3, num1, num2); }
			
			else {
				System.out.printf("A ordem crescente é: \n%d \n%d \n%d", num1, num3, num2); }
		}
		
		else {
			if (num1 > num2) {
				System.out.printf("A ordem crescente é: \n%d \n%d \n%d", num2, num1, num3); }
			
			else {
				System.out.printf("A ordem crescente é: \n%d \n%d \n%d", num1, num2, num3); }
		}
		
		input.close();
	}
}