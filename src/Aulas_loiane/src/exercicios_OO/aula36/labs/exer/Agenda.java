package exercicios_OO.aula36.labs.exer;

public class Agenda {

    private Contato[] contatos ;
    private String nome;

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String obterInfoAgenda(){
        String info = "Nome da agenda: " + this.nome + "\n";

        if(contatos != null ){
            for (Contato c : contatos){
                info += c.informacaoDosContatos() + "\n";
            }
        }

        return info;

    }
}
