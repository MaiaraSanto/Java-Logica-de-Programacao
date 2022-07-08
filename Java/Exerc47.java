package aula01;

import java.util.Scanner;

public class Exerc47 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float num1, num2;
		short opcao;
		
		System.out.print("Digite o primeiro número: ");
		num1 = input.nextFloat();
		System.out.print("Digite o segundo número: ");
		num2 = input.nextFloat();
		System.out.print("Escolha uma opção "
				+ "(1 - média, "
				+ "2 - subtração do maior pelo menor, "
				+ "3 - multiplicação, "
				+ "4 - divisão do primeiro pelo segundo): ");
		opcao = input.nextShort();
		
		switch(opcao) {
		case 1:
			System.out.print("A média entre os números é de " + (num1 + num2)/2);
		break;
		
		case 2:
			if (num1 > num2) {
				System.out.print("A diferença do maior pelo menor é de " + (num1 - num2)); }
			else {
				System.out.print("A diferença do maior pelo menor é de " + (num1 - num2)); }
		break;
		
		case 3: 
			System.out.print("O produto entre os números é de " + (num1*num2));
		break;
		
		case 4:
			if (num2 != 0) {
				System.out.print("A divisão do primeiro pelo segundo é de " + (num1/num2)); }
			else {
				System.out.print("O segundo número deve ser diferente de zero."); }
		break;
		
		default: 
			System.out.print("Opção inválida, por favor digite uma opção entre 1 e 4!");
		}
		
		input.close();
	}
}