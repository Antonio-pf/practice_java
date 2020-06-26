package chapter.four;

public class Test {

    public static void main(String[] args){

        Conta conta = new Conta();
        Data data = new Data();

        conta.nomeTitular = "Antônio";
        conta.numeroDaConta = 465;
        conta.agencia = "462";
        conta.deposita(1000);
        data.dataFormatada(1,05,2020);



        conta.sacar(0);
        conta.deposita(0);
        //System.out.println(conta.recuperaDadosParaImpressao());
        System.out.println();

        //System.out.println("Saldo da conta: $" + conta.saldo);
        System.out.println("Saldo " + conta.pegaSaldo());
        System.out.println("Rendimento mensal: $" + conta.calculaRendimento());


        Conta conta2 = new Conta();

        conta.nomeTitular = "Antônio";
        conta.numeroDaConta = 465;
        conta.agencia = "462";
        //conta.saldo = 100;

        conta2 = conta;



        if	(conta	==	conta2)	{
            System.out.println("iguais");
        }	else	{
            System.out.println("diferentes");
        }

    }
}
