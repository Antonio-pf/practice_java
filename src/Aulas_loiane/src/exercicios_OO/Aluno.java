package exercicios_OO;

public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] disciplinas;
    private double[][] notas;

    public Aluno() {
        this.disciplinas = new String[3];
        this.notas = new double[3][4];

    }

    public Aluno(String nome, String matricula, String nomeCurso) {

        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.disciplinas = new String[3];
        this.notas = new double[3][4];

    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void informacaoAluno() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula " + this.matricula);
        System.out.println("Nome do curso: " + this.nomeCurso);


        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas : " + disciplinas[i]);


            for (int j = 0; j < notas[i].length; j++) {
                System.out.println(notas[i][j] + " ");


            }
            System.out.println();

        }

    }

    public boolean verificaAprovacao(int indice) {

        if (media(indice) >= 7) {
            return true;
        } else {
            return false;
        }

    }

    public double media(int indice) {

        double soma = 0;

        for (int i = 0; i < notas[indice].length; i++) {
            soma += notas[indice][i];
        }
        double media = soma / 4;
        return media;
    }
}
