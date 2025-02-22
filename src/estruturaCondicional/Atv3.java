/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente.  */

package estruturaCondicional;
import java.util.Scanner;

public class Atv3 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.print("A: ");
			A = sc.nextInt();
			
		System.out.print("B: ");
			B = sc.nextInt();
			
			if( (A % B == 0)  || (B % A == 0) ) {
				System.out.println("São Multiplos");
			}
			else { 
				System.out.println("Nao são multiplos");
			}
		
		sc.close();
	}	
}
