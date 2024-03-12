package tarefa01;
import java.util.Scanner;

public class Exercicio02 {
	//Algoritmo para ler um valor do teclado e exibir como resposta o número antecessor.
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite um valor para saber o antecessor: ");
			int Valor = scanner.nextInt();
			int Antecessor = Valor - 1;
			System.out.println("O valor é " + Valor + " = " + Antecessor);
			
			scanner.close();
		} catch (Exception e) {
			System.out.println("Valor invalido!");
		}	
	}
}
