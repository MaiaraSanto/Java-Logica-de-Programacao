/* Desenvolva um programa para determinar a média final e a situação (Aprovado, Reprovado ou Exame) de um aluno em uma disciplina. 
 * São dadas as notas de três provas, o número de aulas ministradas e o número de faltas do aluno. 
 * Sabe-se que a média final é a média aritmética dessas três provas e que a média para aprovação é 7, menor do que 3 para reprovação e as demais em exame. 
 * Entretanto, o aluno estará reprovado se tiver faltado a mais do que 25% das aulas. */

package aula01;

import java.util.Scanner;

public class Exerc34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		double nota1, nota2, nota3;
		int numAulas, numFaltas;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = input.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = input.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = input.nextDouble();
		System.out.print("Informe a quantidade de aulas ministradas: ");
		numAulas = input.nextInt();
		System.out.print("Informe a quantidade de faltas: ");
		numFaltas = input.nextInt();
		
		double mediaFinal = (nota1 + nota2 + nota3) / 3;
		double porcentagemFaltas = (numFaltas * 100) / numAulas;
		
		if (mediaFinal >= 7) {
			if (porcentagemFaltas <= 25) {
				System.out.printf("Situação do aluno: Aprovado! Sua média final é de %.2f e a porcentagem de faltas é de %.2f.", mediaFinal, porcentagemFaltas); }
				else {
					System.out.printf("Situação do aluno: Reprovado! Sua média final é de %.2f, porém a porcentagem de faltas é de %.2f.", mediaFinal, porcentagemFaltas); }
			}
		
		else if (mediaFinal >= 3) {
			if (porcentagemFaltas <= 25) {
				System.out.printf("Situação do aluno: Em exame! Sua média final é de %.2f e a porcentagem de faltas é de %.2f.", mediaFinal, porcentagemFaltas); }
			else {
				System.out.printf("Situação do aluno: Reprovado! Sua média final é de %.2f, porém a porcentagem de faltas é de %.2f.", mediaFinal, porcentagemFaltas); }
		}
		
		else {
			System.out.printf("Situação do aluno: Reprovado! Sua média final é de %.2f e a porcentagem de faltas é de %.2f.", mediaFinal, porcentagemFaltas); }
			
		input.close();
	}
}