package exercicios_OO.aula20.labs;

import java.util.Random;

public class exer02 {

    public static void main(String[] args){

        Random numbersRandom = new Random();
        float arrayNumbers [] [] = new float[10][10];

        for (int i = 0 ; i < arrayNumbers.length; i ++){
            System.out.println("Matriz: " + (i));

            for (int j = 0; j < arrayNumbers[i].length ; j++){
                arrayNumbers[i][j] = numbersRandom.nextInt(10);

                System.out.println(arrayNumbers[i][j] );

            }
            System.out.println();


        }

        

        float menor  = 0;
        float maior = 0;

        for (int i = 4 ; i < arrayNumbers.length; i ++){

            for (int j = 0; j < arrayNumbers[i].length ; j++){
                if(arrayNumbers[i][j] > maior){
                    maior = arrayNumbers[i][j];
                }else if (arrayNumbers [i][j] < menor){
                    menor = arrayNumbers[i][j];
                }
                }


            }

        System.out.println("Menor: " + menor + " Maior: " + maior);






    }
}
