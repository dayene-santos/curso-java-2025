/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
package estruturaSequencial;
*/

package estruturaSequencial;
import java.util.Scanner;

public class Atv3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.print("Valor A: ");
			A = sc.nextInt();
		
		System.out.print("Valor B: ");
			B = sc.nextInt();
		
		System.out.print("Valor C: ");
			C = sc.nextInt();
	
		System.out.print("Valor D: ");
			D = sc.nextInt();
			
		diferenca = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + diferenca);
					
			sc.close();

	}

}
