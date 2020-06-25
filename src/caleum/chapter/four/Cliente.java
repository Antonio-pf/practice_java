package chapter.four;

public class Cliente {

    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    public void mudarCPF(String cpf){

        if (this.idade <= 60){

            validaCpf(cpf);

        }
        this.cpf = cpf;

    }

    public void validaCpf(String cpf){



    }


}


