package exercicios_OO.aula36.labs;

public class Test {

    public static void main(String[] args){

        Contato contato = new Contato();
        Endereco endereco = new Endereco();
        Player player = new Player();
        Team team = new Team();

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

        //team.setPlayer(player); //

        player.setAge(21);
        player.setGender("masculino");
        player.setHeigth("1.89");
        player.setName("Antrovis");
        player.setPosition("Armador");
        player.setWeigth("79.05kg");

        team.setLocation("Amápa");
        team.setName("Blumenau");
        team.getPlayer().getName();

        if(team != null && team.getPlayer()  != null){

            System.out.println(team.getPlayer().getName());

        }
    }
}
