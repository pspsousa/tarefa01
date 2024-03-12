package tarefa01;
import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		// Algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo. Dica a=b.h/2
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Vamos calcular a area do triangulo!");
			System.out.print("Digite a base do triangulo: ");
			float Base = scanner.nextFloat();
			
			System.out.print("Digite a altura do triangulo: ");
			float Altura = scanner.nextFloat();
			
			float Calculo = (Base * Altura) / 2;
			System.out.println("A area do triangulo (" + Base + " * " + Altura + ")/2 = " + Calculo);
			scanner.close();
		} catch (Exception e) {
			System.out.println("Valor invalido!");
		}
	}
	
}
