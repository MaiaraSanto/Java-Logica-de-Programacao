//Escrever um programa para determinar o consumo médio de um automóvel, 
//sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto. 

package aula01;

import  java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double ConsumoMedio;
		double kmi; // distância inicial
		double kmf; //distância final
		double litros;
		double kmtotal;
		
		System.out.print("Informe o km inicial:");
		kmi = input.nextDouble();
		
		System.out.print("Informe o km final:");
		kmf = input.nextDouble();
		
		System.out.print ("Informe a quantidade de litros consumidos:");
		litros = input.nextDouble();
		
		kmtotal = kmf - kmi;
		
		ConsumoMedio = kmtotal / litros;
		
		System.out.println("O total percorrido foi de " + kmtotal + " km");
		System.out.println("O consumo médio foi de " + ConsumoMedio + " litros por km percorrido");
		
		input.close();
	}
}
