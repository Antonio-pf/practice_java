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

}
