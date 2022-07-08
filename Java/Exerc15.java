/* Faça um programa que receba o salário bruto de um funcionário e, usando a tabela a seguir, calcule e mostre o valor a receber. 
 * Sabe-se que este é composto pelo salário bruto acrescido de gratificação e descontado o imposto de 7% sobre o salário.
 * Salário até 350 reais - 100 gratificação, salário de 351 a 600 - gratificação 75, salário de 601 a 900 - gratificação 50, acima de 901 - gratificação de 35. */

package aula01;

import java.util.Scanner;

public class Exerc15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double salarioBruto, salarioFinal, gratificacao, salarioComDesconto, desconto;
		
		System.out.print("Digite o salário bruto: ");
		salarioBruto = input.nextDouble();
		
		if (salarioBruto <= 350) {
			gratificacao = 100; }
		
		else if (salarioBruto <= 600) {
			gratificacao = 75; }
		
		else if (salarioBruto <= 900) {
			gratificacao = 50; }
		
		else {
			gratificacao = 35; }
		
		desconto = salarioBruto * 0.07;
		salarioComDesconto = salarioBruto - desconto;
		salarioFinal = salarioComDesconto + gratificacao;
		
		System.out.println("Salário a receber: " + salarioFinal + " reais.");
		
		input.close();
	}
}