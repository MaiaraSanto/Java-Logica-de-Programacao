/* Uma empresa possui dez funcionários com as seguintes características: 
 * código, número de horas trabalhadas no mês, turno de trabalho (Matutino; Vespertino; Noturno), categoria (Operário; ou Gerente), valor da hora trabalhada.
 */

package aula01;

import java.util.Scanner;

public class Exerc18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int codigo, horasTrabalhadas, qtdeFuncionarios = 10;
		char turno, categoria;
		double valorHora, salarioInicial, auxilioAlimentacao;
		
		/* a) Leia as informações dos funcionários, exceto o valor da hora trabalhada, não permitindo que sejam informações dos turnos e nem categorias inexistentes. 
		 * Trabalhe sempre com a digitação de letras maiúsculas. */
		
		for (int i = qtdeFuncionarios; i > 0; i-- ) {
			turno = 'X';
			categoria = 'X';
		
			System.out.print("Insira o código do funcionário: ");
			codigo = input.nextInt();
			
			System.out.print("Turno (M - matutino, V - vespertino ou N - noturno): ");
			
			while (turno != 'M' && turno != 'V' && turno != 'N') {
				turno = input.next().charAt(0);
				
				if (turno != 'M' && turno != 'V' && turno != 'N') {
					System.out.println("Turno inválido"); }
			}
			
			System.out.print("Insira a categoria do funcionário (O - operário ou G - gerente): ");
			
			while (categoria != 'G' && categoria != 'O') {
				categoria = input.next().charAt(0);
				
				if (categoria != 'G' && categoria != 'O') {
					System.out.println("Categoria inválida"); }
			}
			
			// b) Calcule o valor da hora trabalhada, conforme a tabela 1. Adote o valor de R$450,00 para o salário mínimo.
			
			double salarioMinimo = 450.00;
			
			if (categoria == 'G') {
				if (turno == 'N') {
					valorHora = salarioMinimo * 0.18; }
				else {
					valorHora = salarioMinimo * 0.15; }
			}
			
			else {
				if (turno == 'N') {
					valorHora = salarioMinimo * 0.13; }
				else {
					valorHora = salarioMinimo * 0.10; }
			}
			
			// c) Calcule o salário inicial dos funcionários com base no valor da hora trabalhada e no número de horas trabalhadas.
			System.out.print("Quantidade de horas trabalhadas no mês: ");
			horasTrabalhadas = input.nextInt();
			
			salarioInicial = valorHora * horasTrabalhadas;
			
			// d) Calcule o valor do auxílio alimentação recebido pelo funcionário de acordo com seu salário inicial, conforme a tabela 2.
			
			System.out.print("Insira o salário inicial do funcionário: ");
			salarioInicial = input.nextDouble();
			
			if (salarioInicial < 300.00) {
				auxilioAlimentacao = salarioInicial * 0.2; }
			else if (salarioInicial >= 300.00 && salarioInicial <= 600.00) {
				auxilioAlimentacao = salarioInicial * 0.15; }
			else {
				auxilioAlimentacao = salarioInicial * 0.05; }
			
			double salarioFinal = salarioInicial + auxilioAlimentacao;
			
			System.out.println("\nCódigo: " + codigo);
			System.out.println ("Nº de horas trabalhadas: " + horasTrabalhadas);
			System.out.println ("Valor da hora trabalhada: " + valorHora);
			System.out.println ("Salário inicial: " + salarioInicial);
			System.out.println ("Auxílio alimentação: " + auxilioAlimentacao);
			System.out.println ("Salário final: " + salarioFinal);
			
			System.out.println();
			}
		input.close();
	} 
}