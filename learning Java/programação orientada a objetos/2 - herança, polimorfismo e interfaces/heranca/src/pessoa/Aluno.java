package pessoa;

import constantes.StatusAluno;
import disciplina.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    String dataMatricula;
    String nomeEscola;
    String serieMatriculado;
    List<Disciplina> disciplinas = new ArrayList<>();

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double getMediaNota() {
        double somaNotas = 0.0;

        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getNota();
        }
        return somaNotas / disciplinas.size();
    }

    public String getAprovado() {
        double media = this.getMediaNota();

        if (media >= 6)
            return StatusAluno.APROVADO;
        else if (media >= 3)
            return StatusAluno.RECUPERACAO;
        else
            return StatusAluno.REPROVADO;
    }

    @Override
    public boolean maiorIdade() {
        return idade >= 21;
    }

    @Override
    public double salario() {
        return 1500.0;
    }

    public String msgMaiorIdade() {
        return this.maiorIdade() ? "O aluno é maior de idade" : "O aluno é menor de idade";
    }
}
