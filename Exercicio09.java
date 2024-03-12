package tarefa01;
import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		//Algoritmo para ler as dimensões de um quadrado (lado), calcular e escrever a área do quadrado. Dica a=l²
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Descubra a area do quadrado!");
			System.out.print("Qual tamanho do lado? ");
			
			int Lado = scanner.nextInt();
			int Calculo = Lado * Lado;
			
			System.out.println("A area do quadrado (" + Lado + " * " + Lado + ") = " + Calculo);
			scanner.close();
		} catch (Exception e) {
			System.out.println("Valor invalido!");
		}
	}
}
