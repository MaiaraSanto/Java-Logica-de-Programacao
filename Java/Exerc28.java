/* Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo.
* Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
* Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
* Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º) */

package aula01;

import java.util.Scanner;

public class Exerc28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double angulo1, angulo2, angulo3;
		
		System.out.println("Digite os três ângulos do triângulo: ");
		angulo1 = input.nextDouble();
		angulo2 = input.nextDouble();
		angulo3 = input.nextDouble();
		
		if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
			System.out.print("Este triângulo é acutângulo!");
		}
		
		else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
			System.out.print("Este triângulo é retângulo!");
		}
		
		else {
			System.out.print("Este triângulo é obtusângulo!");
		}
		
		input.close();
	}
}