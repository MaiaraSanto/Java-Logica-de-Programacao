/* A StackX abriu uma linha de crédito para os alunos. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. 
 * Fazer um programa que permita entrar com o salário bruto, o valor do empréstimo e o número de parcelas e informar o valor da parcela 
 * e se o empréstimo pode ou não ser concedido. 
 * Caso o empréstimo não possa ser concedido, informar ainda o valor máximo da prestação. */

package aula01;

import java.util.Scanner;

public class Exerc30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		double salarioBruto, emprestimo, valorParcela;
		int numParcelas;
		
		System.out.print("Informe o valor do salário bruto: ");
		salarioBruto = input.nextDouble();
		
		System.out.print("Qual seria o empréstimo necessário para você? ");
		emprestimo = input.nextDouble();
		
		System.out.print("Em quantas parcelas você deseja pagar? ");
		numParcelas = input.nextInt();
		
		valorParcela = (emprestimo + emprestimo * 0.05) / numParcelas;
		
		if (valorParcela <= 0.3 * salarioBruto) {
			System.out.print("O empréstimo poderá ser concedido, e o valor de cada parcela será de: " + valorParcela + " reais.");
		}
		
		else {
			System.out.print("O empréstimo não poderá ser concedido, pois o valor máx. de sua prestação é de " + 0.3 * salarioBruto + " reais.");
		}
		
		input.close();
	}
}