package tarefa01;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		//Algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor), calcular e escrever a área do losango. Dica a=D.d/2
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Vamos calcular as dimensoes de um losango");
			System.out.print("Diagonal 1: ");
			float Diagonal1 = scanner.nextFloat();
			
			System.out.print("Diagonal 2: ");
			float Diagonal2 = scanner.nextFloat();
			
			float Calculo = (Diagonal1 * Diagonal2) / 2;
			
			System.out.println("A area do losango ("+ Diagonal1 + " * " + Diagonal2 + ")/2 = " + Calculo);
			scanner.close();
		} catch (Exception e) {
			System.out.println("Valor invalido!");
		}
	}
}
