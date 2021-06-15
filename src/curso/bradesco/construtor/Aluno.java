package curso.bradesco.construtor;

public class Aluno {
    private String nome;
    private int matricula;
    private int notafinal;

    //abaixo o método construtor, que vai permitir instanciar a classe Aluno no método main

    public Aluno (String nomeAluno, int numeroMatricula, int nota){
        this.nome = nomeAluno;
        this.matricula = numeroMatricula;
        this.notafinal = nota;
        System.out.println("Novo aluno - nome " + this.nome + " - Matrícula " + this.matricula + " Nota Final: " + this.notafinal);
    }
}
