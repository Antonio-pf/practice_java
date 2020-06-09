package exerciseAula19;

import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double [] vetorA = new double[5];
		double [] vetorB = new double[vetorA.length];
	
		for( int i = 0 ; i < vetorA.length; i ++) {
			System.out.println("Digite o valor do vetor: " + i);
			vetorA[i] = scan.nextDouble();
			vetorB[i] = vetorA[i] *  i;
			
			
		}
		
		    System.out.print("Valores do vetor A: "); 
		for( int i = 0 ; i < vetorA.length; i ++) {
			System.out.print(vetorA[i]+ " ");
			
		}
		
		System.out.print("Valores do vetor B: "); 
		for( int i = 0 ; i < vetorB.length; i ++) {
			System.out.print(vetorB[i]+ " ");
			
		}
		
	
		
	}

}
