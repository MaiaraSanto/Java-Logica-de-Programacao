# Java-Lógica de Programação!

60 exercícios de Linguagem de Programação feitos em JAVA para o Módulo Back End B da StackX

```bash
/*
                                        EXERCÍCIO 1- IF
        Uma empresa decidiu dar uma gratificação de Natal a seus funcionários, 
        baseada no número de horas extras e no número de horas que o funcionário 
        faltou ao trabalho. O valor do prêmio é obtido pela consulta à tabela que se segue.
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);

		double horas, horasExtras, horasFaltas,gratificacao, min;
		
		System.out.print("Digite o total de horas extras: ");
		horasExtras = input.nextDouble();
		
		System.out.print("Digite o total de horas-falta: ");
		horasFaltas = input.nextDouble();
		
		horas = (horasExtras - ( (0.67) * horasFaltas) );
		 min = horas * 60;
		
		if (min < 600) {
		    gratificacao = 100.00;}
		else if (min <= 1200) {
			gratificacao = 200.00;}
		else if (min <= 1800) {
			gratificacao = 300.00;}
		else if (min <= 2400) {
			gratificacao = 400.00;}
		else {
			gratificacao = 500.00;}
			
	System.out.printf("A Gratificação é %.2f reais.\n", gratificacao); 
	System.out.print("**FIM DO ALGORITMO");
		
		input.close();
    }
}
```
