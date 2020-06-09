package exerciseAula19;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int [8];
		int[] vetorB = new int [vetorA.length];
		
		for (int i = 0; i < vetorA.length; i ++) {
			
			System.out.println("Digite cinco valores " + i);
			vetorA [i] = scan.nextInt();
			vetorB [i] = vetorA[i]* 2;	
			
		}
		   
			System.out.print("vetor A = ");
		for (int i = 0; i < vetorA.length; i ++) {
			System.out.print(vetorA[i]);
		}
			System.out.print("vetor B = ");
	    for (int i = 0; i < vetorB.length; i ++) {
		   	System.out.print(vetorB[i]+ " ");
		 
			
		}

	}
	
}
