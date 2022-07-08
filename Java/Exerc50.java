package aula01;

import java.util.Scanner;

public class Exerc50 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int canal, canal4, canal5, canal7, canal12, totalCanais, percCanal4, percCanal5, percCanal7, percCanal12;
		
		canal4 = 0;
		canal5 = 0;
		canal7 = 0;
		canal12 = 0;
		totalCanais = 0;
		
			do {
				System.out.print("Digite o número do canal: ");
				canal = input.nextInt();
				
				if (canal == 4 && canal !=0) {
					canal4 = canal4 + 1;
					totalCanais = totalCanais + 1; }
				else if (canal == 5) {
					canal5 = canal5 + 1;
					totalCanais = totalCanais + 1; }
				else if (canal == 7) {
					canal7 = canal7 + 1;
					totalCanais = totalCanais + 1; }
				else if (canal == 12){
					canal12 = canal12 + 1;
					totalCanais = totalCanais + 1; }
				else {
					System.out.print("\nCanal inválido!\n"); }
				
				percCanal4 = (canal4 * 100) / totalCanais;
				percCanal5 = (canal5 * 100) / totalCanais;
				percCanal7 = (canal7 * 100) / totalCanais;
				percCanal12 = (canal12 * 100) / totalCanais;
			} while (canal != 0);
			
			System.out.print("\nEntrada de dados encerrada!\n");
			
			System.out.println("A audiência do canal 4 é de " + percCanal4 + "%.");
			System.out.println("A audiência do canal 5 é de " + percCanal5 + "%.");
			System.out.println("A audiência do canal 7 é de " + percCanal7 + "%.");
			System.out.println("A audiência do canal 12 é de " + percCanal12 + "%.");
    	
        input.close();
	}
}