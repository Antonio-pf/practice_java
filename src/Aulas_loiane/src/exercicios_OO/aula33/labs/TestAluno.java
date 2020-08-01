package exercicios_OO.aula33.labs;

import exercicios_OO.aula33.labs.Aluno;

import java.util.Scanner;

public class TestAluno {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome: ");
        aluno.setNome(scan.next());
        System.out.println("Entre com o nome do curso: ");
        aluno.setNomeCurso(scan.next());
        System.out.println("Entre com a matrícula: ");
        aluno.setMatricula(scan.next());


        System.out.println("Entre com as disciplinas: ");
        for (int i = 0; i < aluno.getNomeDisciplinas().length; i ++){

            aluno.setDisciplinaPosicao(i,scan.next());

        }

        for (int i = 0; i < aluno.getNomeDisciplinas().length; i ++){
            System.out.println("Notas das disciplinas: " + aluno.getNomeCurso());
            for (int j = 0; j < aluno.getNomeDisciplinas().length; i ++){
                System.out.println("Entre com a nota: " + (j+1));
                aluno.setPosIJ(i,j,scan.nextDouble());
            }

        }




    }
}
