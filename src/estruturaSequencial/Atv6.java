/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre:  
a) a área do triângulo retângulo que tem A por base e C por altura.  
b) a área do círculo de raio C. (pi = 3.14159)  
c) a área do trapézio que tem A e B por bases e C por altura.  
d) a área do quadrado que tem lado B.  
e) a área do retângulo que tem lados A e B.*/

package estruturaSequencial;
import java.util.Scanner;
import java.util.Locale;

public class Atv6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, pi, triangulo, circulo, trapezio, quadrado, retangulo;
		
		pi = 3.14159;
		System.out.print("A: ");
			A = sc.nextDouble();
			
		System.out.print("B: ");
			B = sc.nextDouble();
			
		System.out.print("C: ");
			C = sc.nextDouble();
			
		triangulo = A * C / 2;  // base * altura / 2
		circulo = pi * Math.pow(C, 2);  // pi * raio²
		trapezio = (A + B) / 2 * C;// base + base / 2 * altura
		quadrado = B * B;  // lado ²
		retangulo = A * B; // lado 1 x lado 2
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPZEIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);		
		
		sc.close();
	}

}
