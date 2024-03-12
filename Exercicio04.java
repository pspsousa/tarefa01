package tarefa01;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		//  Algoritmo para ler dois valores do teclado e exibir como resposta a subtração dos valores.
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Vamos fazer a subtracao dos dois valores!");
			System.out.print("Digite o primeiro Valor: ");
			int Valor1 = scanner.nextInt();
			System.out.print("Digite o segundo Valor: ");
			int Valor2 = scanner.nextInt();
			
			int Subtracao = Valor1 - Valor2;
			System.out.println("Resultado = " + Subtracao);
			scanner.close();
		} catch (Exception e) {
			System.out.println("Valor invalido!");
		}
	}
	
}
