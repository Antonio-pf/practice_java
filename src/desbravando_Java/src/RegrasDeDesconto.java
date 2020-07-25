public class RegrasDeDesconto {

    public static void main(String[] args){

        Livro livro = new Livro();
        livro.setRetornaValor(54.6);

        System.out.println("Valor atual: $" + livro.getValor());

        if(!livro.aplicaDesconto(0.3)){
            System.out.println("Desconto não pode ser maior do que 30%");

        }else {
            System.out.println("Valor com desconto: $" + livro.getValor());
        }

    }
}
