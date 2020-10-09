package exercicios_OO.aula15.labs;

import java.util.Scanner;

public class exer04 {

    public static void main(String [] arg) {

        Scanner scan = new Scanner(System.in);

        String letra = "";

        System.out.println("Digite uma letra: ");
        letra = scan.next();

        String vogais [] = new String[5];
        vogais[0] = "a";
        vogais[1] = "e";
        vogais[2] = "i";
        vogais[3] = "o";
        vogais[4] = "u";

        for (int i = 0; i < vogais.length; i ++){
            if (letra.equals(vogais[i])){
                System.out.println("É vogal");

        }else {
                System.out.println("Essa letra é consoante");
                break;
            }
        }

    }
}
