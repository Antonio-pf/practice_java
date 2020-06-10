package desafios;

public class Soma {

    public int somatoria(int numero){

        if(numero == 1){

            return numero;

        }else  {
            return numero + somatoria(numero - 1);
        }
    }
}
