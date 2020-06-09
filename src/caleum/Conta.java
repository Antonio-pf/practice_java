package exercicios;

public class Conta {

    String nomeTitular;
    int numeroDaConta;
    String agencia;
    double saldo;
    String dataAberturaConta;


    void sacar(double valor){



    }
    void deposita(double valor){

        this.saldo = this.saldo + valor;

    }
    double calculaRendimento(){

        return this.saldo * 0.1;
    }
    String recuperaDadosParaImpressao(){
        String	dados ="Titular: "+this.nomeTitular;
        dados	+= "\nNúmero: " + this.numeroDaConta;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: $" + this.saldo;
        dados += "\nData de Abertura: " + this.dataAberturaConta;
        this.calculaRendimento();


        return	dados;

    }
}
