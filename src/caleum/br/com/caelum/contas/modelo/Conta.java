package br.com.caelum.contas.modelo;

public class Conta {

    private String agencia;
    private int numeroDaConta;
    private String nomeTitular;
    private double saldo;
    private Data dataAberturaConta;
    private int limite;
    private int totalDeContas;
    private int identificador = 0;


    Conta(String nomeTitular){
      
    }
    public void sacar(double valor) {
        this.saldo = this.saldo - valor;

    }

    public void deposita(double valor) {

        this.saldo =+ valor;
    }

    public String recuperaDadosParaImpressao() {

        String dados = "Titular: " + this.nomeTitular;
        dados += "\nNúmero: " + this.numeroDaConta;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: $" + this.saldo;
        //dados += "\nData de Abertura: " + this.dataAberturaConta.dataFormatada(01, 5, 2020);
        // ??como acessar o valor? usar gets e sets?
        dados += "\nRendimento: $ "+ this.getRendimento();
        this.getRendimento();


        return dados;

    }
    public Conta(){
        this.totalDeContas++;
    }

    public String getNomeTitular(){
        return this.nomeTitular;
    }
    public String setNomeTitular(String nomeTitular){
        return this.nomeTitular = nomeTitular;
    }

    public String getAgencia(){

        return this.agencia;
    }
    public String setAgencia(String agencia){
        return this.agencia = agencia;
    }
    public int getNumeroDaConta(){

        return  this.numeroDaConta;
    }
    public int setNumeroDaConta(int numeroDaConta){

        return this.numeroDaConta = numeroDaConta;
    }
    public double getSaldo(){

        return this.saldo;
    }
    public double setSaldo(double saldo){
        return this.saldo = saldo;

    }
    public double getRendimento() {

        return this.saldo * 0.1;
    }



}





