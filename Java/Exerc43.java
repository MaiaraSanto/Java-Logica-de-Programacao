// Baseado no exercício resolvido em https://www.youtube.com/watch?v=bikTBZmi1cU

package aula01;

import java.util.Scanner;

public class Exerc43 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int cod, num_vei, num_acid, soma_vei, maior = 0, cid_maior = 0, menor = 0, cid_menor = 0, soma_acid, cont_acid;
		double media_vei, media_acid;
		
		soma_vei = 0;
		soma_acid = 0;
		cont_acid = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o código da " + i + "ª cidade: "); 
			cod = input.nextInt();
			
			System.out.print("Digite o número de veículos da " + i + "ª cidade: ");
			num_vei = input.nextInt();
			
			System.out.print("Digite o número de acidentes com vítimas da " + i + "ª cidade: ");
			num_acid = input.nextInt();
			
			//a) Qual é o maior e qual é o menor índice de acidentes de trânsito e a que cidades pertencem.
			if (i == 1) {
				maior = num_acid;
				cid_maior = cod;
				menor = num_acid;
				cid_menor = cod;
			}
			
			else {
				if (num_acid > maior) {
					maior = num_acid;
					cid_maior = cod; }
				else if (num_acid < menor) {
					menor = num_acid;
					cid_menor = cod; }
			}
			
			soma_vei = soma_vei + num_vei;
			if (num_vei < 2000) {
				soma_acid = soma_acid + num_acid;
				cont_acid = cont_acid + 1; }
			
		} // fechando o FOR.
			
			System.out.println("\nMaior número de acidentes = " + maior + " na cidade de código = " + cid_maior);
			System.out.println("Menor número de acidentes = " + menor + " na cidade de código = " + cid_menor);
			
			// b) Qual é a média de veículos nas cinco cidades juntas;
			media_vei = soma_vei/5;
			System.out.printf("Média de acidentes nas 5 cidades = %.1f \n", media_vei);
			
			// c) Qual é a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
			if (cont_acid == 0) {
				System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos."); }
			
			else {
				media_acid = soma_acid/cont_acid;
				System.out.printf("Média de acidentes nas cidades com menos de 2000 veículos = %.1f \n", media_acid); }
		
		input.close();
	}
}