/* Desenvolva um programa que dada a idade de uma pessoa, determine sua condição de eleitor conforme a tabela:
 * Menor que 16 anos - Não pode votar; 
 * Maior ou igual a 16 e menor que 18 anos ou maior ou igual a 65 anos - Facultativo;
 * Entre 18 e 64 anos - Obrigatório. */

package aula01;

import java.util.Scanner;

public class Exerc32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		short idade;
		
		System.out.print("Digite sua idade: ");
		idade =  input.nextShort();
		
		if (idade < 16) {
			System.out.print("Sua condição de eleitor é: 'Não pode votar'."); }

		else if (idade >= 16 && idade < 18 || idade >= 65) {
			System.out.print("Sua condição de eleitor é: 'Voto facultativo'."); }
		
		else {
			System.out.print("Sua condição de eleitor é: 'Voto obrigatório'."); }
		
		input.close();
	}
}