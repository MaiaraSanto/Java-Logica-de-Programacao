package aula01;

import java.util.Scanner;

public class Exerc23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		short numLados;
		float base, altura;
		
		System.out.print("Digite o número de lados do polígono regular: ");
		numLados = input.nextShort();
		
		if (numLados == 3) {
			System.out.print("Digite o valor da base: ");
			base = input.nextFloat();
			
			System.out.print("Digite o valor da altura: ");
			altura = input.nextFloat();
			
			System.out.print("Este polígono é um triângulo, e sua área é de " + (base * altura) / 2 + " cm²."); }
		
		else if (numLados == 4) {
			System.out.print("Digite o valor da base: ");
			base = input.nextFloat();
			
			System.out.print("Digite o valor da altura: ");
			altura = input.nextFloat();
			
			System.out.print("Este polígono é um quadrado, e sua área é de " + (base * altura) + " cm².");
		}
		
		else if (numLados == 5) {
			System.out.print("Este polígono é um pentágono!");
		}
		
		else {
			System.out.print("Número de lados inválido, por favor insira 3, 4 ou 5.");
		}
		
		input.close();
	}
}