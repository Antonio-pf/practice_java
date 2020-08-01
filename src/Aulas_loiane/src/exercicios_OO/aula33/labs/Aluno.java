package exercicios_OO.aula33.labs;

public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas;
    private double[][] notas;

    public Aluno() {
        this.nomeDisciplinas = new String[3];
        this.notas = new double[3][4];

    }

    public Aluno(String nome, String matricula, String nomeCurso) {

        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = new String[3];
        this.notas = new double[3][4];

    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
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

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] notasDisciplinas) {
        this.nomeDisciplinas = notasDisciplinas;
    }

    public void informacaoAluno() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula " + this.matricula);
        System.out.println("Nome do curso: " + this.nomeCurso);


        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas : " + nomeDisciplinas[i]);


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

    public void setDisciplinaPosicao(int pos, String nomeDisciplina) {

        this.nomeDisciplinas[pos] = nomeDisciplina;

    }

    public void setPosIJ(int posI, int posJ, double nota){

        this.notas [posI][posJ] = nota;

    }

}