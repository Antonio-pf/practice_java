package exerciseAula19;

import java.util.Scanner;

public class exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[4];
		
		for(int i = 0; i < vetorA.length; i ++) {
			
			System.out.println("Digite os valores da posição: " + i);
			vetorA[i] = scan.nextInt();
			
		}
		
		int soma = 0;
		for(int i = 0; i < vetorA.length; i ++) {
			soma += vetorA[i];
		
		
		}
			System.out.print("Vetor a: " );
	    for(int i = 0; i < vetorA.length; i ++) {
	    	System.out.print(vetorA[i] + " ");
			
		
	}
        	System.out.print("Soma dos valores = " + soma);
 
   }
	
}

