package estruturaDeDados;

import java.util.Scanner;

public class StringBuilderTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        StringBuilder rev = new StringBuilder();

        //valida palíndromo
        System.out.println("Write a word:");
        sb.append(scan.nextLine());

        if ((sb == sb.reverse())){

            System.out.println("it's not a palindrome");

        }else {

            System.out.println(sb+" it's palindrome");

        }

    }
}
