package exercicios_OO.aula20.labs;

import java.util.Scanner;

public class exer03 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        float number [] = new float[3];

        for (int i = 0; i < number.length; i++){

                System.out.println("Insira os números: ");

                number[i] = scan.nextFloat();
        }
        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < number[i]; i ++){
            if (number[i] % 2 == 0){
                contadorPar ++;

            }else {
                contadorImpar ++;
            }
        }
        System.out.println("Qntds de pares: " + contadorPar );
        System.out.println("Qntds de impares: " + contadorImpar);

    }
}

