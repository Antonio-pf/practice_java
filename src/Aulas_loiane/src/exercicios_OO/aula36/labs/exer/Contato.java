package exercicios_OO.aula36.labs.exer;

public class Contato {

    private String nome;
    private String telefone;
    private String email;
    private Agenda agenda;

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

    public String informacaoDosContatos(){

        return "Nome = " + this.nome + "; " +
                "Telefone = " + this.telefone + "; " +
                "Email = " + this.email;

        }
    }
