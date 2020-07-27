package exercicios_OO;

public class Aluno {

    private String nome;
    private String matricula;
    private String[] cursoMatriculado;
    private int [] nota;

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

    public String[] getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String[] cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public double aprovado() {

        double soma = 0;

        for (int i = 0; i < nota.length; i++) {
            soma += nota[i];

        }
        if (soma >= 7) {
            System.out.println("Aprovado!");
            return soma;

        }else {
            System.out.println("Reprovado");
            return soma;
        }
       
    }
}
