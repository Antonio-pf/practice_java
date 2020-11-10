package exercicios_OO.aula36.labs.exer;

public class Contato {

    private String nome;
    private String telefone;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void informacaoDosContatos(){
        System.out.println("Infomação dos contatos: ");
        System.out.println(this.nome);
        System.out.println(this.telefone);
        System.out.println(this.email);

    }
}
