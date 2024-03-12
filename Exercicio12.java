package tarefa01;
import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		//Algoritmo para ler as dimensões de um circulo (raio), calcular e escrever a área do circulo. a=pi*r²
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Vamos calcular a area do circulo!");
			System.out.print("Digite o raio: ");
			float Raio = scanner.nextFloat();
			double Pi = Math.PI;
			double Calculo = Pi * Math.pow(Raio, 2);
			
			System.out.println("A area do circulo: " + Calculo);
			scanner.close();
			
		} catch (Exception e) {
			System.out.println("Valor invalido!");
		}
	}
}
