package aula01;

import java.util.Scanner;

public class Exerc37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float valorCompra;
		
		System.out.print("Digite o valor da compra: ");
		valorCompra = input.nextFloat();
		
		if (valorCompra < 10) {
			System.out.print("O seu lucro será de 70%, portanto o valor da venda será de: " + (valorCompra + valorCompra * 0.7) + " reais.");
		}
		
		else if (valorCompra < 30) {
			System.out.print("O seu lucro será de 50%, portanto o valor da venda será de: " + (valorCompra + valorCompra * 0.5) + " reais.");
		}
		
		else if (valorCompra < 50) {
			System.out.print("O seu lucro será de 40%, portanto o valor da venda será de: " + (valorCompra + valorCompra * 0.4) + " reais.");
		}
		
		else {
			System.out.print("O seu lucro será de 30%, portanto o valor da venda será de: " + (valorCompra + valorCompra * 0.3) + " reais.");
		}
		
		input.close();
	}
}