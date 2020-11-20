package estruturaDeDados;

public class Test05 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.add("B");
        vetor.add("C");
        vetor.add("E");
        vetor.add("F");
        vetor.add("G");

        System.out.println(vetor);
        vetor.add(0,"A");
        vetor.add(4,"K");
        System.out.println(vetor);

    }

}
