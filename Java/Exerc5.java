// Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
// A fórmula de conversão é:  F= (9*C+160) / 5,  sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. 

package aula01;

import java.util.Scanner; 

public class Exerc5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double C, F; 
		
		 System.out.print("Digite a temperatura em Graus Celsius: ");
		 C = input.nextDouble();
		 
		 F = (9 * C + 160) / 5;

		 System.out.print("A temperatura convertida para Fahrenheit é: " +F +"ºF");
		 
		 input.close();
	}
}
