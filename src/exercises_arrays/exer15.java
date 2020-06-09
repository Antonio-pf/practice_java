package exerciseAula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exer15 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA= new int [11];
		
		for(int i = 0; i < vetorA.length; i ++) {
			
			System.out.println("Digite os valores do vetor A:" +i);
			vetorA[i] = scan.nextInt();
			
		}
		
		double percentualPar = 0;
		double percentualImpar = 0;
		double qtdPar = 0;
		double qtdImpa = 0;
		
		for(int i = 0; i < vetorA.length; i ++) {
			if(vetorA[i] % 2 == 0) {
				qtdPar++;
			}else {
				qtdImpa++;
				
			}
			 percentualPar = ((qtdPar / vetorA.length) * 100); 
			 percentualImpar = ((qtdImpa / vetorA.length) * 100); 
			
		}
		
		DecimalFormat df = new DecimalFormat("##,##.");
		System.out.println("Percentual de pares: " + df.format(percentualPar)+ "%");
		System.out.println("Percentual de ímpares: " + df.format(percentualImpar)+ "%");

		
	}

}
