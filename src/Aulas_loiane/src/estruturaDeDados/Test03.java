package estruturaDeDados;

public class Test03 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.add("Casa Branca");
        vetor.add("São José");
        vetor.add("Itobi");

        System.out.println(vetor.search("ca"));


    }
}
