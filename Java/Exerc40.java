//  Faça um programa que receba o custo de fábrica de um carro e mostre o custo ao consumidor.

package aula01;

import java.util.Scanner;

public class Exerc40 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float custoFabrica;
		
		System.out.print("Digite o custo de fábrica: ");
		custoFabrica = input.nextFloat();
		
		if (custoFabrica < 12000) {
			System.out.print("O custo ao consumidor será de: " + (custoFabrica + custoFabrica * 0.05) + " reais."); }
		
		else if (custoFabrica < 25000) {
			System.out.print("O custo ao consumidor será de: " + (custoFabrica + custoFabrica * 0.10 + custoFabrica * 0.15) + " reais."); }
		
		else {
			System.out.print("O custo ao consumidor será de: " + (custoFabrica + custoFabrica * 0.15 + custoFabrica * 0.20) + " reais."); }
		
		input.close();
	}
}