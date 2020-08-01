package exercicios_OO.aula33.labs;

public class Lampada {

    private String modelo;
    private String tesao;
    private String cor;
    private String tipoLuz;
    private String [] tipos;
    private int potencia;
    private int garantiaMeses;
    private boolean tipoAbajur;
    private boolean ligada;


    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public void ligar(){
        setLigada(true);
    }

    public void desligada(){
        setLigada(false);
    }
    public boolean estado(){

        if(isLigada()){

            System.out.println("Lâmpada ligada");
            return true;
        }else{
            System.out.println("Lâmpada desligada");
            return false;
        }

    }
    public void mudarEstado(){
        if(isLigada()){
            desligada();
        }else {
            ligar();
        }
    }

}
