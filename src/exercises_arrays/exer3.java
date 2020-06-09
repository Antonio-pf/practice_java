package exerciseAula19;

import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [2];
		int [] vetorB = new int [vetorA.length];
		
		for(int i = 0; i < vetorA.length; i ++) {
			System.out.println("Digite os valores dos arrays: " + i);
			vetorA [i] = scan.nextInt();
			vetorB [i] = vetorA[i] * 2 ;
		}
			System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i ++) {
			System.out.print(vetorA[i] + " ");
															
		}
		

			System.out.print("Vetor B = ");
		for(int i = 0; i < vetorB.length; i ++) {
			System.out.print(vetorB[i] + " ");
		
		}
		
 	}

}
