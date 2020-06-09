package exercicios;

public class Test {

    public static void main(String[] args){

        Conta conta = new Conta();

        conta.nomeTitular = "Antônio";
        conta.numeroDaConta = 465;
        conta.agencia = "462";
        conta.saldo = 100;
        conta.dataAberturaConta = "05/06/1999";

        conta.deposita(150);
        System.out.println(conta.recuperaDadosParaImpressao());
        System.out.println();

        System.out.println("Saldo da conta: $" + conta.saldo);
        System.out.println("Rendimento mensal: $" + conta.calculaRendimento());


        Conta conta2 = new Conta();

        conta.nomeTitular = "Antônio";
        conta.numeroDaConta = 465;
        conta.agencia = "462";
        conta.saldo = 100;
        conta.dataAberturaConta = "05/06/1999";
        conta = conta2;

        if	(conta	==	conta2)	{
            System.out.println("iguais");
        }	else	{
            System.out.println("diferentes");
        }

    }
}
