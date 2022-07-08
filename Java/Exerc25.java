/* Acrescente as seguintes mensagens à solução da tarefa 14 conforme o caso.
 * Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
 * Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO. */

package aula01;

import java.util.Scanner;

public class Exerc25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		short numLados;
		float base, altura;
		
		System.out.print("Digite o número de lados do polígono regular: ");
		numLados = input.nextShort();
		
		if (numLados < 3 ) {
			System.out.print("Não é um polígono!");
		}
		
		else if (numLados == 3) {
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
			System.out.print("Polígono não identificado.");
		}
		
		input.close();
	}
}