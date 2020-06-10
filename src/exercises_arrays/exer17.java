package exerciseAula19;

import java.util.Scanner;

public class exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double [] idades = new double [4];
		
		for(int i = 0; i < idades.length ; i ++) {
			
			System.out.println("Digite os valores das idades: " +i);
			idades[i] = scan.nextInt();
			
		}

				
		
	}

}
