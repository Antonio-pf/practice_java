package exercicios_OO;

public class Conta {

    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double valor) {

        if (this.saldo >= valor) {
            System.out.println("Saque pode ser efetuado");
        } else {
            System.out.println("Saque indisponível. \nSaldo $" + this.saldo + "\nSaque desejado $" +valor);


        }
    }
    public void deposita(double valor){

        this.saldo += valor;
        System.out.println("$" + saldo);

    }




}

