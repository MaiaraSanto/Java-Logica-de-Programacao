/* Informar idade e peso para calcular a dosagem de determinado medicamento. 
 * Imprimir a receita informando quantas gotas do medicamento (500 mg/mL) o paciente deve tomar por dose (1 mL = 20 gotas).
 * 12 anos ou mais: peso >= 60 kg devem tomar 1000 mg. Peso < 60 - 875 mg.
 * Abaixo de 12 anos: 5 a 9 kg - 125 mg, 9.1 a 16 - 250 mg, 16.1 a 24 - 375 mg, 24.1 a 30 - 500 mg, acima de 30 kg - 750 mg. */

package aula01;

import java.util.Scanner;

public class Exerc39 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		short idade;
		float peso;
		
		System.out.print("Informe a idade do paciente: ");
		idade = input.nextShort();
		
		System.out.print("Informe o peso do paciente: ");
		peso = input.nextFloat();
		
		// qtdeGotas = (20 * dosagem) / 500
		
		if (idade >= 12) {
			if (peso >= 60) {
				System.out.print("Você deve tomar 1000 mg, ou seja, " + ((20 * 1000)/500) + " gotas."); }
			else {
				System.out.print("Você deve tomar 875 mg, ou seja, " + ((20 * 875)/500) + " gotas."); }
		}
		
		else {
			if (peso >= 5 && peso <= 9) {
				System.out.print("Você deve tomar 125 mg, ou seja, " + ((20 * 125)/500) + " gotas."); }
			else if (peso > 9 && peso <= 16) {
				System.out.print("Você deve tomar 250 mg, ou seja, " + ((20 * 250)/500) + " gotas."); }
			else if (peso > 16 && peso <= 24) {
				System.out.print("Você deve tomar 375 mg, ou seja, " + ((20 * 375)/500) + " gotas."); }
			else if (peso > 24 && peso <= 30) {
				System.out.print("Você deve tomar 500 mg, ou seja, " + ((20 * 500)/500) + " gotas."); }
			else if (peso > 30){ 
				System.out.print("Você deve tomar 750 mg, ou seja, " + ((20 * 750)/500) + " gotas."); }
			else {
				System.out.print("Este medicamento não é indicado para pessoas com menos de 5 kg."); }
			}
		
		input.close();
	}
}