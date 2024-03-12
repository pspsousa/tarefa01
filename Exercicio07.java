package tarefa01;
import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		//Algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo. Dica a=b.h
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Vamos calcular a base do retangulo!");
			
			System.out.print("Digite a base maior: ");
			float BaseMaior = scanner.nextFloat();
			System.out.print("Digite a base menor: ");
			float BaseMenor = scanner.nextFloat();

			float Calculo = BaseMaior * BaseMenor;
			
			System.out.println("A base do retangulo tem: " + Calculo + "m²");
			scanner.close();
			
		} catch (Exception e) {
			System.out.println("Valor invalido!");
		}
	}
}
