package exercicios_OO.aula48.labs;

public class MultiplosCatch {

    public static void main(String[] args){

        int [] numeros = {4, 8, 16, 32, 64, 128};
        int [] demon = {2, 0, 4, 8, 0};

        for(int i = 0; i <= numeros.length; i ++){

            try {

                System.out.println(numeros[i] + "/" + demon[i] + " = " +  (numeros[i]/demon[i]));

                //expressão usada para versões java >= 7
                //caso contrário usar múltiplos catch
            }catch (ArithmeticException | ArrayIndexOutOfBoundsException exception){

                System.out.println("ERRO!!!!");
            }

            System.out.println("Erro de divisão por zero");
        }
            //Tratamento de erro genérico
            /*catch (Throwable exeption){
                System.out.println("ERRO!!");
            }*/

    }
}
