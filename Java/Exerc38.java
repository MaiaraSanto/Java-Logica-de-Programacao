package aula01;

import java.util.Scanner;

public class Exerc38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float peso, altura;
		
		System.out.print("Digite o peso: ");
		peso = input.nextFloat();
		
		System.out.print("Digite a altura: ");
		altura  = input.nextFloat();
		
		float imc = peso / (altura * altura);
		
		if (imc < 20) {
			System.out.printf("Para o IMC %.2f, a faixa de risco é: abaixo do peso.", imc); }
		
		else if (imc < 25) {
			System.out.printf("Para o IMC %.2f, a faixa de risco é: normal.", imc); }
		
		else if (imc < 30) {
			System.out.printf("Para o IMC %.2f, a faixa de risco é: excesso de peso.", imc); }
		
		else if (imc < 35) {
			System.out.printf("Para o IMC %.2f, a faixa de risco é: obesidade.", imc); }
		
		else {
			System.out.printf("Para o IMC %.2f, a faixa de risco é: obesidade mórbida.", imc);
		}
		
		input.close();
	}
}