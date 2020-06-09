package exerciseAula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exer4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [4];
		double [] vetorB = new double [vetorA.length];


		for(int i = 0; i < vetorA.length; i ++) {
			System.out.println("Digite o valor para o vetor: " + i);
			vetorA [i] = scan.nextInt();
			vetorB [i] = Math.sqrt(vetorA[i]); 
		}
		
		  System.out.print("Vetor a: " );

		for(int i = 0; i < vetorA.length; i ++) {
			System.out.print(vetorA[i] + "-");

		
		}
		
		
			DecimalFormat df = new DecimalFormat("##,##.##");
		 System.out.println("");
		
		 System.out.print("Vetor B: " );

		for(int i = 0; i < vetorA.length; i ++) {
			System.out.print(df.format (vetorB[i]) + " ");

		
		}
    }
}

