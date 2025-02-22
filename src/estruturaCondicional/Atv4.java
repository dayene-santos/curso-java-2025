/* 
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. 
*/

package estruturaCondicional;
import java.util.Scanner;

public class Atv4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio, horaFinal, duracao;
		
		System.out.println("Inicio:  ");
			horaInicio = sc.nextInt();
			
		System.out.println("Final");
			horaFinal = sc.nextInt();
			
			if (horaInicio < horaFinal) {
				duracao =  horaFinal - horaInicio;
			}
			else {
				duracao = 24 - horaInicio + horaFinal;
			}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();

	}

}
