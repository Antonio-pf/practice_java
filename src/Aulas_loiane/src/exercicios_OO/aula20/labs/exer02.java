package exercicios_OO.aula20.labs;

import java.util.Random;

public class exer02 {

    public static void main(String[] args){

        float arrayNumbers [] [] = new float[10][10];

        Random numbersRandom = new Random();

        for (int i = 0 ; i < arrayNumbers.length; i ++){
            for (int j = 0; j < arrayNumbers[i].length ; j++){
                arrayNumbers[i][j] = numbersRandom.nextInt(100 );

            }
        }
        for (int i = 0 ; i < arrayNumbers.length; i ++){
            for (int j = 0; j < arrayNumbers[i].length ; j++) {

                System.out.print( +arrayNumbers[i][j] + " - ");
            }
            System.out.println();
        }

        float menorL5  = 100;
        float maiorL5 = 0;
        int linha5 = 5;

        for (int i = 0   ; i < arrayNumbers[linha5].length; i ++){
                if(arrayNumbers[linha5][i] > maiorL5){
                    maiorL5 = arrayNumbers[linha5][i];
                }
                if (arrayNumbers [linha5][i] < menorL5){
                    menorL5 = arrayNumbers[linha5][i];
                }
        }

        System.out.println("Menor valor da linha 5: " + menorL5 );
        System.out.println("Maior valor da linha 5: " + maiorL5);

        float menorC7  = 100;
        float maiorC7 = 0;
        int col7 = 7;
        for (int i = 0 ; i < arrayNumbers.length; i ++){

            if(arrayNumbers[i][col7] > maiorC7){
                maiorC7 = arrayNumbers[i][col7];
            }
            if (arrayNumbers [i][col7] < menorC7){
                menorC7 = arrayNumbers[i][col7];
            }
        }

        System.out.println("Menor valor da coluna 7: " + menorC7 );
        System.out.println("Maior valor da coluna 7: " + maiorC7 );

    }
}
