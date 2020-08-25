package exercicios_OO.aula15.labs;

import java.util.Scanner;

public class exer02 {

    public static void main(String [] arg) {

        Scanner scan = new Scanner(System.in);

        double num1 = 0;

        System.out.println("Digite um número: ");
        num1 = scan.nextDouble();

        if(num1 >= 0){
            System.out.println("Número positivo");
        }else {
            System.out.println("Número negativo");
        }

    }

}
