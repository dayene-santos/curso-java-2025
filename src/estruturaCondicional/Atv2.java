/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */
package estruturaCondicional;
import java.util.Scanner;

public class Atv2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Número: ");
			numero = sc.nextInt();
			
			if (numero % 2 == 0 ) {
				System.out.println("PAR");	
			}
			else {
				System.out.println("IMPAR");
			}
				
		sc.close();
	}

}
