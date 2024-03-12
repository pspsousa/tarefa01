package tarefa01;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		//Algoritmo para ler um valor do teclado e exibir como resposta o número sucessor.
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite um valor para descobrir o sucessor: ");
			int Valor = scanner.nextInt();
			int Sucessor = Valor + 1;
			System.out.println("O sucessor é " + Valor + " = " + Sucessor);
			
			scanner.close();
		} catch (Exception e) {
			System.out.println("Digite um valor valido!");
		}
		
		
	}
}
