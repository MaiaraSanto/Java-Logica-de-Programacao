// Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
// O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.

package aula01;

import java.util.Scanner;

public class Exerc6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double real;
		double dolar;
		double cotacao;
		
		 System.out.print("Digite a quantidade em reais: ");    
		 real = input.nextDouble();
		 
		 System.out.print("Digite a cotação do dolar: ");    
		 cotacao = input.nextDouble();

		 dolar = real / cotacao;
		 
		 System.out.printf("Você possui %.2f dólares", dolar);
		 
		 input.close();
	}
}
