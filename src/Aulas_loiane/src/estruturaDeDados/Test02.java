package estruturaDeDados;

public class Test02 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.add("Juan");
        vetor.add("Carlos");
        vetor.add("Antônio");

        System.out.println(vetor.size());
        System.out.println("Array" + vetor  );

    }

}
