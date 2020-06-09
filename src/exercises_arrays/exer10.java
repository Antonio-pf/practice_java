package exerciseAula19;

import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[4];
		int [] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i ++ ) {
			
			System.out.println("Entre com os valores da posição: " + i);
			vetorA[i]= scan.nextInt();
			vetorB[i]= vetorA[i];
			
			
			
			
			
		}
		
	}

}
