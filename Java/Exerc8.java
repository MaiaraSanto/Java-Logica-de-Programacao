/* As maçãs custam R$ 0,30 cada se forem compradas menos de uma dúzia e R$ 0,25 se forem compradas pelo menos doze. 
 * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. */

package aula01;

import java.util.Scanner;

public class Exerc8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		short quantMacas;
		double custo;
		
		System.out.print("Quantas maçãs você deseja comprar? ");
		quantMacas = input.nextShort();
		
		if (quantMacas < 12 ) {
			custo = quantMacas * 0.30;
		}
		
		else {
			custo = quantMacas * 0.25; 
		}
		
		System.out.print("Custo total de compra para " + quantMacas + " maçãs: " + custo + " reais.");
		
		input.close();
	}
}