package chapter.four;

public class Conta {

    private String agencia;
    private int numeroDaConta;
    private String nomeTitular;
    private double saldo;
    private Data dataAberturaConta;
    private int limite;
    public double getSaldo(){
        return this.saldo + this.limite;
    }

    public double pegaSaldo() {
        return this.saldo;

    }

    public void sacar(double valor) {
        this.saldo = this.saldo - valor;

    }

    public void deposita(double valor) {

        this.saldo =+ valor;
    }

    public double calculaRendimento() {

        return this.saldo * 0.1;
    }

    public String getNomeTitular(){
        return this.nomeTitular;
    }
    public String setNomeTitular(String nomeTitular){
        return this.nomeTitular = nomeTitular;
    }

    public String recuperaDadosParaImpressao() {

        String dados = "Titular: " + this.nomeTitular;
        dados += "\nNúmero: " + this.numeroDaConta;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: $" + this.saldo;
        dados += "\nData de Abertura: " + this.dataAberturaConta.dataFormatada(01, 5, 2020);

        this.calculaRendimento();


        return dados;


    }
}
