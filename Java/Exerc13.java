package aula01;

import java.util.Scanner;

public class Exerc13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double horasExtras, horasFaltas;
		
		System.out.print("Digite o total de horas extras: ");
		horasExtras = input.nextFloat();
		
		System.out.print("Digite o total de horas-falta: ");
		horasFaltas = input.nextFloat();
		
		double H = (horasExtras - ( (0.67) * horasFaltas) );
		double min = H * 60;
		
		if (min < 600) {
			System.out.print("A gratificação será de R$100,00."); }
		else if (min <= 1200) {
			System.out.print("A gratificação será de R$200,00."); }
		else if (min <= 1800) {
			System.out.print("A gratificação será de R$300,00."); }
		else if (min <= 2400) {
			System.out.print("A gratificação será de R$400,00."); }
		else {
			System.out.print("A gratificação será de R$500,00."); }
		
		input.close();
	}
}