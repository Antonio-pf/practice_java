package exercicios_OO;

public class Conta {

    private int numero;
    private double saldo;
    private boolean especial;
    private double limiteEspecial;


    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    public double getLimiteEspecial() {


        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public boolean isEspecial() {
        return this.especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public boolean saque(double valor) {

        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;

        }else{
            if(especial){
                double limite = this.limiteEspecial + this.saldo;
            if(limite >= valor){
                this.saldo -= valor;
                return true;

            }else {
                return  false;
            }
            }else {
                return false;

            }
        }
    }
    public void deposita(double valor){

        this.saldo += valor;
        System.out.println("$" + this.saldo);

    }
    public void consultarSaldo(){

        System.out.println("Saldo atual: $" + this.saldo);
    }

    public boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }




}

