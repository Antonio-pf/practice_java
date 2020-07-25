public class ComprandoLivros {

    public static void main(String[] args) {

        Autor autor = new Autor();
        Livro livro = new  Livro();

        autor.setNome("Josialdo Bocas");
        autor.setEmail("jbocas@gmmal.com");
        autor.setCpf("465-893-669-01");


        livro.setNome("Java 8");
        livro.setDescricao("Boas Práticas");
        livro.setIsbn("456-99-663-2");
        livro.setRetornaValor(59.90);

        livro.setAutor(autor);



        livro.mostrarDetalhes();
        livro.aplicaDesconto(0.3);



    }
}
