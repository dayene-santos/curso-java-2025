/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais.*/

package estruturaSequencial;
import java.util.Scanner;
import java.util.Locale;

public class Atv4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario, horasTrabalhadas;
		double salario, valorHora;
		
		System.out.print("Número do Funcionário:  ");
			funcionario = sc.nextInt();
			
		System.out.print("Horas Trabalhadas:  ");
			horasTrabalhadas = sc.nextInt();
		
		System.out.print("Valor Hora:  ");
			valorHora = sc.nextDouble();
			
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
			
		sc.close();

	}

}
