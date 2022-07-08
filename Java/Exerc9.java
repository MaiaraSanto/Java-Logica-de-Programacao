/* Faça um programa que receba a idade de um nadador e mostre sua categoria, usando as regras a seguir. 
 * Para idade inferior a 5, deverá mostrar a mensagem "nenhuma".
 * Categorias: infantil (5 a 7 anos), juvenil (8 a 10), adolescente (11 a 15), adulto (16 a 30) ou sênior (acima de 30 anos). */

package aula01;
import java.util.Scanner;

public class Exerc9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int idade;
		
		System.out.print("Digite a idade do nadador: ");
		idade = input.nextInt();
		
		if (idade < 5) {
			System.out.printf("A idade do nadador é inferior a 5 anos, portanto não poderá competir!"); }
		
		else if (idade <= 7) {
			System.out.printf("A idade do nadador é de %d anos, portanto sua categoria é infantil.", idade); }
		
		else if (idade <= 10) {
			System.out.printf("A idade do nadador é de %d anos, portanto sua categoria é juvenil.", idade); }
		
		else if (idade <= 15) {
			System.out.printf("A idade do nadador é de %d anos, portanto sua categoria é adolescente.", idade); }
		
		else if (idade <= 30) {
			System.out.printf("A idade do nadador é de %d anos, portanto sua categoria é adulto.", idade); }

		else {
			System.out.printf("A idade do nadador é de %d anos, portanto sua categoria é sênior.", idade); }

		input.close();
	}
}