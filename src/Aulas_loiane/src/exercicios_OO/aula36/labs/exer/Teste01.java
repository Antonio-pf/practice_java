package exercicios_OO.aula36.labs.exer;

import java.util.Scanner;

public class Teste01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Contato[] contatos = new Contato[1];
        Agenda agenda = new Agenda();
        Contato contato = new Contato();

        System.out.println("Insira o nome da agenda: ");
        agenda.setNome(scan.nextLine());


        for(int i = 0; i < 1; i++){
            System.out.println("Insira as informações contato "+ (1+i) + "º");
            Contato c = new Contato();

            System.out.println("Nome do contato:");
            String nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Telefone do " + nome + ": ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Email: " + nome + ": ");
            String email = scan.nextLine();
            c.setEmail(email);
            System.out.println("--------------------------------------");

            contatos[i] = c;
        }

        agenda.setContatos(contatos);

        if(agenda != null){

            System.out.println(agenda.obterInfoAgenda());

        }

    }
}
