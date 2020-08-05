package exercicios_OO.aula20.labs;

import java.util.Random;

public class exer01 {

    public static void main(String[] args) {

        float[][] numerosAleatórios = new float[3][3];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatórios.length; i++) {
            for (int j = 0; j < numerosAleatórios[i].length; j++) {
                numerosAleatórios[i][j] = numeroRandom.nextInt(100);
                System.out.println("Linha: " + i + " Coluna: " + j + " Valor: " + numerosAleatórios[i][j] );

            }
            System.out.println("-------------------------------");


        }

        float maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < numerosAleatórios.length; i ++){

            for (int j = 0; j < numerosAleatórios[i].length; j++) {
                if (numerosAleatórios[i][j] > maior){
                    maior = numerosAleatórios[i][j];
                    linha = i;
                    coluna = j;

                }
            }
        }

        System.out.println();
        System.out.println("Maior valor!!!!");
        System.out.println("Linha: " + linha + " Coluna: " + coluna + " Valor: " + maior);


    }
}

