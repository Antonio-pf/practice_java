package exercicios_OO.aula34.labs;

import exercicios_OO.aula15.labs.While;

public class Contador {

    private static int contador;

    public Contador(){
        System.out.println("Incrementando e/ou zerando");
    }


    public static void incrementar() {

        while (contador < 4){

            contador ++;
        }

    }

    public static void zeraContador() {

        contador = 0;
    }

    public static void retornaValor() {

        System.out.println(contador);

    }


}
