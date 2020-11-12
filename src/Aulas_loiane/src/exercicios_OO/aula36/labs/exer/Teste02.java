package exercicios_OO.aula36.labs.exer;

import java.util.Scanner;

public class Teste02 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Curso curso = new Curso();
        Aluno[] aluno = new Aluno[5];


        for(int i = 0; i <= aluno.length; i++){
            System.out.println("Digite o nome do aluno " + (i++) +" :");
            aluno[i].setNome(scan.next());


        }




    }
}
