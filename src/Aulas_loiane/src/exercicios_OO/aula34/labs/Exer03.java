package exercicios_OO.aula34.labs;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int numero;

        do{
            System.out.println("Digite um número positivo: ");
            numero = scan.nextInt();

            if(numero < 0){

                System.out.println("Tente novamente!!");

            }
        }
        while (numero < 0);{

            System.out.println(MinhaCalculadora.fatorial(numero) );

        }
    }
}
