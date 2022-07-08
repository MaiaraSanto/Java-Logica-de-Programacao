package aula01;

import java.util.Scanner;

public class Exerc41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float salario = 1000; 
		double percentual = 0.015;
		double novoSalario = salario + percentual * salario;

		System.out.printf("No ano 2000, o salário era de %.1f reais.\n", salario);
		System.out.printf("No ano 2001, o salário era de %.1f reais.\n", novoSalario);
		
		for (int ano = 2002; ano < 2018; ano++) {
		percentual = 2 * percentual;
		novoSalario = (novoSalario * percentual) + novoSalario;
		System.out.printf("No ano %d, o salário era de %.1f reais.\n", ano, novoSalario);
		}
		
		input.close();
	}
}