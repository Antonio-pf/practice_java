package exercicios_OO.aula15.labs;

import java.util.Scanner;

public class exer03 {

    public static void main(String [] arg) {

        Scanner scan = new Scanner(System.in);

        String tipoSexo;

        System.out.println("Digite uma letra(F-M): ");
        tipoSexo = scan.next();

        if (tipoSexo.equalsIgnoreCase("f")){
            System.out.println("Femenino");
        }else if(tipoSexo.equalsIgnoreCase("m")){
            System.out.println("Masculino");
        }else{
            System.out.println("Letra inválida!!!");
        }
    }
}
