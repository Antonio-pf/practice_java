package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

public class Test {

    public static void main(String[] args){

        Conta conta = new Conta();
        Data data = new Data();

        conta.deposita(450);
        conta.setAgencia("456-66-7888-7");
        conta.setNumeroDaConta(456);
        conta.setNomeTitular("Antônio");
        System.out.println();



        conta.recuperaDadosParaImpressao();
        System.out.println(conta.recuperaDadosParaImpressao());




    }
}
