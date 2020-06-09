package exerciseAula19;

import java.util.Scanner;

public class exer7 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		double [] vetorA = new double [4];
		double [] vetorB = new double [4];
		double [] vetorC = new double [vetorA.length - vetorB.length];
		
		for(int i = 0; i < vetorA.length; i ++) {
			System.out.println("Digite os valores para o vetor A: " + i);
			vetorA[i] = scan.nextDouble();			
			
		}
		for(int i = 0; i < vetorB.length; i ++) {
			System.out.println("Digite os valores para o vetor B: " + i);
			vetorB[i] = scan.nextDouble();		
			vetorC[i] = (vetorA[i] - vetorB[i]);
		
		}
			System.out.println();
			System.out.print("Valores do vetor A: " );
		for(int i = 0; i < vetorA.length; i ++) {
			System.out.print(vetorA[i] + " ");
			
		}
			System.out.println();
			System.out.print("Valores do vetor B: " );
		for(int i = 0; i < vetorB.length; i ++) {
			System.out.print(vetorB[i] + " ");
			
		}
			System.out.println();
			System.out.print("Valores do vetor C: " );
		for(int i = 0; i < vetorC.length; i ++) {
			System.out.print(vetorC[i] + " ");
			
		}


	   }		
		
	}

