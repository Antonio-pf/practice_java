package exercicios_OO;

public class Lampada {

    public boolean estado(boolean ligada){

        if(!ligada){

            System.out.println("Lâmpada ligada");
            return true;
        }else{
            System.out.println("Lâmpada desligada");
            return false;
        }

    }


}
