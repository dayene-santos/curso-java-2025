/* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

package estruturaFor;
import java.util.Locale;
import java.util.Scanner;

public class Atv4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // número de pares
		
		for (int i = 0; i < n; i++) {
		    double v1 = sc.nextDouble();
		    double v2 = sc.nextDouble();
		    if (v2 == 0) {
		    	System.out.println("Divisão impossível");
		    } else {
		    	System.out.printf("%.1f%n", v1/v2);
		    }
		}
	        
		sc.close();
	}

}
