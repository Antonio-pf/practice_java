package exercicios_OO.aula15.labs;

import java.util.Scanner;

public class While {

    public static void main(String [] arg) {

        Scanner scan = new Scanner(System.in);
        int number = 0;



        boolean ehPar = false;

        while (!ehPar){

            System.out.println("Digite um número par: ");
            number = scan.nextInt();

            if(number % 2 == 0){

                System.out.println("É par");
                ehPar = true;
            }else {
                System.out.println("Try again");

            }
        }
    }
}
