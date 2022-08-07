package classes;

import constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// classe para representar u aluno
public class Aluno {
    // atributos de Aluno
    // por padrão os atributos são privados
    String nome;
    int idade;
    List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    // usar o "new" chama o construtor abaixo
    public Aluno() { // cria os dados na memória — sendo padrão do Java ('alt' + 0151: —)
    }

    public Aluno(String nomePadrao) {
        nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    }
    // -----------------------------------------------------------------------------------------------------------------------

    // Método que retorna a média do aluno
    public double getMediaNota() {
        double somaNotas = 0.0;

        // Percorrer lista
        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getNota();
        }
        return somaNotas / disciplinas.size();
    }

    // Método que retorna true se o aluno está aprovado
    public boolean getAprovado() {
        double media = this.getMediaNota();

        if (media >= 6)
            return true;
        else return false;
    }

    public String getAprovado2() {
        double media = this.getMediaNota();

        if (media >= 6)
            return StatusAluno.APROVADO;
        else if (media >= 3)
            return StatusAluno.RECUPERACAO;
        else
            return StatusAluno.REPROVADO;
    }

    // -----------------------------------------------------------------------------------------------------------------------
    // SETTERS  e GETTERS do objeto
    // SET é para adicionar ou receber dados
    // GET é para resgatar ou obter valor do atributo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
