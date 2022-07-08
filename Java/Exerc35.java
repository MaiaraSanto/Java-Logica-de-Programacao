/* Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for menor que R$ 20,00;
* caso contrário, o lucro será de 30%. Desenvolva um programa que dado o valor do produto, imprimir o valor de venda. */

package aula01;

import java.util.Scanner;

public class Exerc35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float valorProduto;
		
		System.out.print("Digite o valor do produto: ");
		valorProduto = input.nextFloat();
		
		if (valorProduto < 20) {
			System.out.print("O valor de venda será de " + (valorProduto + valorProduto * 0.45) + " reais.");
		}
		
		else {
			System.out.print("O valor de venda será de " + (valorProduto + valorProduto * 0.30) + " reais.");
		}
		
		input.close();
	}
}