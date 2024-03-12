package tarefa01;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Algoritmo para ler dois valores do teclado e exibir a soma dos valores.
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Soma de dois valores!");
			System.out.print("Digite o primeiro Valor: ");
			int Valor1 = scanner.nextInt();
			System.out.print("Digite o segundo Valor: ");
			int Valor2 = scanner.nextInt();
			
			int Soma = Valor1 + Valor2;
			System.out.println("A soma dos valores = " + Soma);
			scanner.close();
		} catch (Exception e) {
			System.out.println("Valor invalido!");
		}
	}

}
