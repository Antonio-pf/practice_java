package exerciseAula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exer14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double [] vetorA = new double [2];
		double [] impar = new double [2];
		double soma = 0;
		
		for(int i = 0; i < vetorA.length; i ++) {
			System.out.println("Digite o valor do vetor "+i+":");
			vetorA[i] = scan.nextDouble();
			soma += vetorA[i];
			
		}
		
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("Somatoria dos elementos: " + soma);
		System.out.print("Valores dos vetores de A: ");
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
					
		}
		double media = 0;
		int qntdPares = 0;
		int qntdImpar = 0;
		int somaIm = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				qntdImpar ++;
				impar[i] = vetorA[i];//valores impares
				somaIm += impar[i]; //somatória de all elementos do array
			}else {
				qntdPares ++;		
			}
		}
		double [] impar2 = new double[qntdImpar];
		
		for(int i = 0; i < impar.length; i++ ) {
			if(impar[i] != 0) {
				impar2[qntdImpar] = impar[i];
				qntdImpar++;
				//tentativa
			}
			
		}
			
			System.out.println("    ");
			System.out.println("------------------------------------------");
			System.out.print("Valores dos vetores impares: ");
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(impar[i]+" ");
			System.out.println("   vaaaaaaaaaai " + impar2[i]);

			 
		}
		
			DecimalFormat df = new DecimalFormat ("");
					
			System.out.println("    ");
			System.out.println("------------------------------------------");
			System.out.println("Quantidade de números pares: " + qntdPares);
			System.out.println("Quantidade de números ímpares: " + qntdImpar);
			System.out.println("Média dos números ímpares: " + df.format(somaIm/qntdImpar));
			System.out.println("   vaaaaaaaaaai " );
		
	}
}
