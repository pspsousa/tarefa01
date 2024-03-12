package tarefa01;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		//Algoritmo para ler dois valores do teclado e exibir como resposta a divisão dos valores.
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Vamos fazer a divisao de dois valores!");
			System.out.print("Digite o primeiro Valor: ");
			float Valor1 = scanner.nextFloat();
			System.out.print("Digite o segundo Valor: ");
			float Valor2 = scanner.nextFloat();
			
			float Divisao = Valor1 / Valor2;
			System.out.println("O resultado é = " + Divisao);
			scanner.close();
		} catch (Exception e) {
			System.out.println("Valor invalido!");
		}
	}
}
