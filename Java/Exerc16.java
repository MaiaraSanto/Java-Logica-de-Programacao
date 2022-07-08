/* Faça um programa que receba o salário de um funcionário chamado Carlos. Sabe-se que outro funcionário, João, tem salário equivalente a um terço do salário de Carlos. 
 * Carlos aplicará seu salário integralmente na caderneta de poupança, que rende 2% ao mês, e João aplicará seu salário integralmente no fundo de renda fixa, que rende 5% ao mês. 
 * O programa deverá calcular e mostrar a quantidade de meses necessários para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos. */

package aula01;

import java.util.Scanner;

public class Exerc16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salarioCarlos, salarioJoao;
		short meses = 0;
		
		System.out.print("Digite o valor do salário de Carlos: ");
		salarioCarlos = input.nextDouble();
		
		salarioJoao = salarioCarlos / 3;
		
		while (salarioJoao <= salarioCarlos) {
			salarioCarlos = salarioCarlos * 1.02;
			salarioJoao = salarioJoao * 1.05;
			meses++; }
		
		System.out.print("O valor de João se igualará ao valor de Carlos em " + meses + " meses.");
		
		input.close();
	}
}