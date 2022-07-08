/* Depois da liberação do governo para as mensalidades dos planos de saúde, as pessoas começaram a fazer pesquisas para descobrir um bom plano, não muito caro. 
 * Um vendedor de um plano de saúde apresentou a tabela a seguir. 
 * Até 10 anos: R$ 30,00; Acima de 10 até 29 anos: R$ 60,00; Acima de 29 até 45 anos: R$ 120,00; Acima de 45 até 59 anos: R$ 150,00; Acima de 59 até 65 anos: R$ 250,00; Maior que 65 anos: R$ 400,00.
 */

package aula01;

import java.util.Scanner;

public class Exerc36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		short idade;
		
		System.out.print("Digite a idade: ");
		idade = input.nextShort();
		
		if (idade <= 10) {
			System.out.print("O valor a ser pago será de R$30,00."); }
		
		else if (idade <= 29) {
			System.out.print("O valor a ser pago será de R$60,00."); }
		
		else if (idade <= 45) {
			System.out.print("O valor a ser pago será de R$120,00."); }
		
		else if (idade <= 59) {
			System.out.print("O valor a ser pago será de R$150,00."); }
		
		else if (idade <= 65) {
			System.out.print("O valor a ser pago será de R$250,00"); }
		
		else {
			System.out.print("O valor a ser pago será de R$400,00"); }
	
		input.close();
	}
}