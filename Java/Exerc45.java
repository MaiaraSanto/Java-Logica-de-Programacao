package aula01;

import java.util.Scanner;

public class Exerc45 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		short codigo, qtde;
		double precoUnit = 0, precoNota, valorDesc, precoFinal;
		
		System.out.print("Digite o código do produto: ");
		codigo = input.nextShort();
		
		System.out.print("Digite a quantidade comprada: ");
		qtde = input.nextShort();
		
		switch (codigo) {
		case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10:
			precoUnit = 10;
		break;
		
		case 11, 12, 13, 14, 15, 16, 17, 18, 19, 20:
			precoUnit = 15;
		break;
		
		case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30:
			precoUnit = 20;
		break;
		
		case 31, 32, 33, 34, 35, 36, 37, 38, 39, 40:
			precoUnit = 30;
		break;
		
		default:
			System.out.print("Código inválido, por favor digite somente valores entre 1 e 40.\n"); 
		}
		
		if (codigo > 0 && codigo < 41) {
		System.out.printf("\nPreço Unitário: R$%.2f", precoUnit);
		
		precoNota = qtde * precoUnit;
		System.out.printf("\nPreço TOTAL da nota: R$%.2f", precoNota);
		
		if (precoNota < 250) {
			valorDesc = precoNota * 0.05; }
		
		else if (precoNota <= 500) {
			valorDesc = precoNota * 0.10; }
		
		else {
			valorDesc = precoNota * 0.15; }
		
		System.out.printf("\nValor do desconto: R$%.2f", valorDesc);
		
		precoFinal = precoNota - valorDesc;
		System.out.printf("\nPreço FINAL da Nota: R$%.2f", precoFinal);
		}
		
		input.close();
	}
}