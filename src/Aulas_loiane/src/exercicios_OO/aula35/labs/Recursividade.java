package exercicios_OO.aula35.labs;

public class Recursividade {

    public static int fatorial(int num){

        if (num == 0){

            return 1;
        }

        return num * fatorial(num - 1);

    }
}
