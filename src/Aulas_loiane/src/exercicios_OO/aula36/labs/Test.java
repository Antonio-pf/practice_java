package exercicios_OO.aula36.labs;

public class Test {

    public static void main(String[] args){

        Contato contato = new Contato();
        Endereco endereco = new Endereco();

        contato.setNome("Juan");
        contato.setTelefone("156-656-86");

        endereco.setNomeRua("Game of");
        endereco.setNumero("n/a");
        endereco.setCidade("Bacorro");
        endereco.setComplemento("Comércio");
        endereco.setEstado("SP");
        endereco.setCep("568965");

        contato.setEndereco(endereco);

        System.out.println(contato.getNome());
        System.out.println(contato.getTelefone());

        if(contato != null && contato.getEndereco() != null){// trata o erro caso não tenha setado

            System.out.println(contato.getEndereco().getCidade());

        }
    }
}
