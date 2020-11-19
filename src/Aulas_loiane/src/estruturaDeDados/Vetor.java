package estruturaDeDados;

import java.util.Arrays;

public class Vetor {

            private String[] elements;
            private int scale;//tamanho

            //qntd de elem que desejo para o vetor
            public Vetor(int capacity){

                this.elements = new String[capacity];
                this.scale = 0;


        }

      /*  public void add(String element){

                for (int i = 0; i<this.elements.length; i ++){
                    if(this.elements[i] == null){
                        this.elements[i] = element;
                        break;
                    }
                }
        }*/

         /*public void add(String element) throws Exception{

          if (this.scale < this.elements.length){

                this.elements[this.scale] = element;
                this.scale++;

            }else {
              throw new Exception("Vetor já está cheio. Valor máx para elementos =" + this.scale);
          }
        }*/

    public boolean add(String element)  {

        if (this.scale < this.elements.length) {

            this.elements[this.scale] = element;
            this.scale++;
            return true;

        }

        return false;

    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < this.size()-1; i ++){
            s.append(this.elements[i]);
            s.append(", ");
        }

        if (this.size() > 0){
            s.append(this.elements[this.size()-1]);

        }
        s.append("]");
            return s.toString();

    }

    public int size(){

        return this.scale;

    }

}
