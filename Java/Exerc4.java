// Escrever um programa que leia o nome de um aluno e as notas das tr�s provas que ele obteve no semestre. 
// No final informar o nome do aluno e a sua m�dia (aritm�tica).

package aula01;

import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String nomeAluno;
		double nota1;
		double nota2;
		double nota3;
		double mediaFinal;
		
		System.out.print("Digite o nome do aluno: ");
		nomeAluno = input.nextLine();
		
		System.out.print("Digite a nota da primeira prova: ");
		nota1 = input.nextDouble();
		
		System.out.print("Digite a nota da segunda prova: ");
		nota2 = input.nextDouble();
	
		System.out.print("Digite a nota da terceira prova: ");
		nota3 = input.nextDouble();

		mediaFinal = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Nome do aluno: " +nomeAluno);  
		System.out.println("A m�dia do aluno �: " +mediaFinal); 
		
		input.close();
	}
}
