/* 
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */


package estruturaSequencial;
import java.util.Scanner; 
import java.util.Locale;

public class Atv5 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
      
        int qtdePeca1, qtdePeca2;
        double valorPeca1, valorPeca2, total;
        
        
        System.out.print("Código da peça 1: ");
        sc.nextInt();
        
        System.out.print("Quantidade de peças 1: ");
        qtdePeca1 = sc.nextInt();
        
        System.out.print("Valor unitário da peça 1: ");
        valorPeca1 = sc.nextDouble();
        

        System.out.print("Código da peça 2: ");
        sc.nextInt();
        
        System.out.print("Quantidade de peças 2: ");
        qtdePeca2 = sc.nextInt();
        
        System.out.print("Valor unitário da peça 2: ");
        valorPeca2 = sc.nextDouble();
        
       
        total = (qtdePeca1 * valorPeca1) + (qtdePeca2 * valorPeca2);
        
      
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        
        sc.close();
    }
}
