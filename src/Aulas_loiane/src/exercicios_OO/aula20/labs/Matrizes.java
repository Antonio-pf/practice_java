package exercicios_OO.aula20.labs;

public class Matrizes {

    public static void main(String [] args){

        double [][] notasAluno = new double[3][4];

        notasAluno[0][0] = 10;
        notasAluno[0][1] = 0;
        notasAluno[0][2] = 0;
        notasAluno[0][3] = 9.5;

        notasAluno[1][0] = 8;
        notasAluno[1][1] = 6;
        notasAluno[1][2] = 5;
        notasAluno[1][3] = 9.5;

        notasAluno[2][0] = 8;
        notasAluno[2][1] = 6;
        notasAluno[2][2] = 5;
        notasAluno[2][3] = 9.5;



        for (int i = 0; i < notasAluno.length; i ++){

            for (int j = 0; j < notasAluno[i].length; j ++){
                System.out.println(notasAluno[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println("Calculando média: " );

        double soma;
        double media;

        for (int i = 0; i < notasAluno.length; i ++){

            soma = 0;
            media = 0;



            for (int j = 0; j < notasAluno[i].length; j ++){
                soma += notasAluno[i][j];
                media = soma / 4;




        }
            System.out.println(Math.round(media));



        }



    }


}
