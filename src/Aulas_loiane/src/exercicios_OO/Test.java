package exercicios_OO;

public class Test {

    public static void main(String[] args){

        Lampada lampada = new Lampada();
        Conta conta = new Conta();
        Aluno aluno = new Aluno();

        lampada.ligar();
        lampada.estado();
        lampada.desligada();
        lampada.estado();
        lampada.mudarEstado();
        lampada.estado();

        System.out.println();

        conta.setSaldo(600);
        conta.saque(3000);
        conta.deposita(400);




    }
}
