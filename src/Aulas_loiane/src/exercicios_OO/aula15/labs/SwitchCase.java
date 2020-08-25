package exercicios_OO.aula15.labs;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String [] arg){
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o dia da semana(1-7) ");

                int diaSemana = scan.nextInt();
        if(diaSemana > 7){

        }

        switch (diaSemana){
            case 1: System.out.println("Domingo");
            break;
            case 2: System.out.println("Segunda");
            break;
            case 3: System.out.println("Terça");
            break;
            case 4: System.out.println("Quarta");
            break;
            case 5: System.out.println("Quinta");
            break;
            case 6: System.out.println("Sexta");
            break;
            case 7: System.out.println("Sabádo");
            break;
            default:
                System.out.println("Opção inválido");
        }

    }
}
