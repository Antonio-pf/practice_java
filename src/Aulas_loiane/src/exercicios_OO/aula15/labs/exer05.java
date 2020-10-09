package exercicios_OO.aula15.labs;

import java.util.Scanner;

public class exer05 {

    public static void main(String [] arg) {

        Scanner scan = new Scanner(System.in);

        char[][] jogoDaVelha = new char[3][3];

        System.out.println("Jogador 1 = O ");
        System.out.println("Jogador 2 = X ");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna =0;

        while (!ganhou){

            if(jogada % 2 == 1 ){

                System.out.println("Jogador 1. Escolha linha e coluna: ");
                sinal = 'O';

            }else {

                System.out.println("Jogador 2. Escolha linha e coluna: ");

                sinal = 'X';

            }
            boolean linhaValida = false;

            while (!linhaValida){

                System.out.println("Entre com a linha (1, 2 ou 3): ");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3){

                    linhaValida = true;

                }else {
                    System.out.println("Entrada inválida. Try again!!");
                }

            }
            boolean colunaValida = false;

            while (!colunaValida){

                System.out.println("Entre com a coluna(1, 2 ou 3): ");
                coluna = scan.nextInt();
                if (coluna >=1 && coluna <=3){

                    colunaValida = true;

                }else {

                    System.out.println("Entrada inválida. Try again!!");

                }
            }
        }
    }
}
