package exercicios_OO.aula15.labs;

import java.util.Scanner;

public class exer01 {

    public static void main(String [] arg){

        Scanner scan = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.println("Digite dois números: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }

    }

}
