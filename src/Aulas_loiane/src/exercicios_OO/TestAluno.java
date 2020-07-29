package exercicios_OO;

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




    }
}
