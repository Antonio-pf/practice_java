package exercicios_OO.aula47.labs;

public class Excecao {

    public static void main(String[] args){

        //Tente executar o code(try)
        // e caso aconteça um exceção
        // capture-a e trate o erro(Catch)

        try {

            int vetor[] = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1;

            System.out.println("O texto não será impresso");

        }catch (ArrayIndexOutOfBoundsException exception){

            System.out.println("Erro ao acessar index do vetor que não existe");

        }
    }
}
