package exerciseAula19;

import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA= new int [10];
		
		for(int i = 0; i < vetorA.length; i ++) {
			
			System.out.println("Digite os valores do vetor A:" +i);
			vetorA[i] = scan.nextInt();
			
		}
		
			int qtdPares = 0;
		for(int i = 0; i < vetorA.length; i ++) {
			if(vetorA[i] % 2 == 0) {
				++qtdPares;
				
				
				}	
			
	    	}
		
			System.out.print("Vetor a: " );

		for(int i = 0; i < vetorA.length; i ++) {
			System.out.print(vetorA[i] + " ");

			}
			System.out.println("Quantidade de números pares  é :"+ qtdPares);
	 }

}