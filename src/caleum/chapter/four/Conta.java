package chapter.four;

public class Conta {

    public String nomeTitular;
    public int numeroDaConta;
    public String agencia;
    public double saldo;
    public Data dataAberturaConta;


    public void sacar(double valor){

    }
    public void deposita(double valor){

        this.saldo = this.saldo + valor;

    }
     public double calculaRendimento(){

        return this.saldo * 0.1;
    }
    public String recuperaDadosParaImpressao(){

        String	dados ="Titular: "+this.nomeTitular;
        dados	+= "\nNúmero: " + this.numeroDaConta;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: $" + this.saldo;
        dados += "\nData de Abertura: " + this.dataAberturaConta.dataFormatada(01,5,2020);

        this.calculaRendimento();


        return	dados;

    }

}
