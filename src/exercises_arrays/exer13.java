package exerciseAula19;

import java.util.Scanner;

public class exer13 {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA= new int [10];
		
		for(int i = 0; i < vetorA.length; i ++) {
			
			System.out.println("Digite os valores do vetor A:" +i);
			vetorA[i] = scan.nextInt();
			
		}
			int soma = 0;
			int diviCinco = 0;
			for(int i = 0; i < vetorA.length; i++) {
				if(vetorA[i] % 5 == 0) {
					diviCinco++;
					soma += vetorA[i];
			}
				
				}
			   System.out.println("Valores de A: "  );
			for(int i = 0; i < vetorA.length; i ++) {
				System.out.print(vetorA[i]+ " ");
		 }
			
				System.out.println("");
				System.out.println("Divisíveis por cinco : " +diviCinco);
				System.out.println("Soma: " + soma);
     }
 
}
