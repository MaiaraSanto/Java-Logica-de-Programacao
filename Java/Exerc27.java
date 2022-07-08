/* Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno.
 * Triângulo Equilátero: possui os 3 lados iguais.
 * Triângulo Isósceles: possui 2 lados iguais.
 * Triângulo Escaleno: possui 3 lados diferentes. */

package aula01;

import java.util.Scanner;

public class Exerc27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		System.out.println("Digite os 3 lados do triângulo:");
		lado1 = input.nextInt();
		lado2 = input.nextInt();
		lado3 = input.nextInt();
		
		if (lado1 == lado2) {
			if (lado1 == lado3) {
				System.out.print("Este triângulo é equilátero!"); }
			
			else {
				System.out.print("Este triângulo é isósceles!"); }
		}
		
		else if (lado2 == lado3) {
			System.out.print("Este triângulo é isósceles!"); }
		
		else {
			System.out.print("Este triângulo é escaleno!"); }
		
		input.close();
	}
}