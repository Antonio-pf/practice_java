package exercicios_OO.aula34.labs;

public class MinhaCalculadora {

    public static double soma(double numA, double numB){

        double result = 0;

        result = numA + numB;
        return result;

    }

    public static double subtracao(double numA, double numB) {

        double result = 0;

        result = numA - numB;
        return result;

    }

    public static double multiplicacao(double numA, double numB) {

        double result = 0;

        result = numA * numB;
        return result;
    }

    public static double divisao(double numA, double numB) {

        double result = 0;

        result = Math.round(numA / numB);
        return result;
    }

    public static double potencia(double numA, double numB){

        double result = 0;

        result = Math.pow(numA , numB);
        return result;

    }

    public static int fatorial(int num){

        if(num == 0){


        }
        int total = 1;

        for (int i = num; i > 1; i -- ){

            total *= num;
            num--;

        }

        System.out.println("Fatorial = " + total);

        return total;

    }

}
