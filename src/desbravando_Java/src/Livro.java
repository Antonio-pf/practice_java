public class Livro {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor; //atributo do tipo autor. Uma classe pode ter uma classe como atributo. nomea-se: composição

    public Livro(){

        System.out.println("Novo livro cadastrado");
    }


    void mostrarDetalhes(){

        System.out.println();
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + this.nome );
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Valor: $ " + this.valor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println();

        if (temAutor()){

            autor.mostrarDetalhesAutor();

        }else {
            System.out.println("Não tem autor!!");
        }

        System.out.println("-------------");

    }

    public boolean aplicaDesconto(double porcentagem){

        if (porcentagem > 0.3){

            return false;

        }else{

            this.valor -= this.valor * porcentagem;
             return true;
        }


    }

    public boolean temAutor (){

        return this.autor != null;

    }
    void setRetornaValor(double valor){
        this.valor = valor;
    }
    double getValor(){
        return this.valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
}
