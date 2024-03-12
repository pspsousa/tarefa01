package tarefa01;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		//Algoritmo para ler dois valores do teclado e exibir como resposta a multiplicação dos valores.
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Vamos fazer a multiplicacao dos dois valores!");
			
			System.out.print("Digite o primeiro Valor: ");
			int Valor1 = scanner.nextInt();
			System.out.print("Digite o segundo Valor: ");
			int Valor2 = scanner.nextInt();
			
			int Multiplicacao = Valor1 * Valor2;
			System.out.println("O resultado é = " + Multiplicacao);
			scanner.close();
		} catch (Exception e) {
			System.out.println("Valor invalido!");
		}
	}
}
