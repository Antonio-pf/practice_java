package estruturaDeDados;

public class Vetor {

            private String[] elements;
            private int scale;

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

        public void add(String element){

            try {

                this.elements[this.scale] = element;
                this.scale++;

            }catch (ArrayIndexOutOfBoundsException exception){

                System.out.println("Tamanho máx de elementos");

            }




        }
}
