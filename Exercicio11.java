package tarefa01;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		//Algoritmo para ler as dimensões de um trapézio (base amior, base menor e altura), calcular e escrever a área do trapézio. a=(B+b).h/2
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Vamos calcular a area de um trapezio");
			
			System.out.print("Base Maior: ");
			float BaseMaior = scanner.nextFloat();
			System.out.print("Base Menor: ");
			float BaseMenor = scanner.nextFloat();
			System.out.print("Altura: ");
			float Altura = scanner.nextFloat();
			
			float Calculo = (BaseMaior + BaseMenor) * Altura / 2;
			System.out.println("A area do losango (" + BaseMaior + " + " + BaseMenor + ")*" + Altura + "/2 = " + Calculo);
			scanner.close();
		} catch (Exception e) {
			System.out.println("Valor invalido!");
		}
	}
}
