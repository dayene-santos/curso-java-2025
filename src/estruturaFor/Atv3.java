/* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
* de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
* conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
* peso 5.
 */


package estruturaFor;
import java.util.Locale;
import java.util.Scanner;

public class Atv3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();  // Número de conjuntos

		for (int i = 0; i < n; i++) {
		    double v1 = sc.nextDouble();
		    double v2 = sc.nextDouble();
		    double v3 = sc.nextDouble();
		            
		    // Cálculo da média ponderada
		    double media = ((v1 * 2) + (v2 * 3) + (v3 * 5)) / 10.0;

		    System.out.printf("%.1f%n", media);
       }
	        
         sc.close();
    }
}

