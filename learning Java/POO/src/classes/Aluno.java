package classes;

// classe para representar u aluno
public class Aluno {
    // atributos de Aluno
    // pro padrão os atributos são privados
    public String nome;
    public int idade;
    double nota1;
    double nota2;
    double nota3;
    double nota4;

    // usar o "new" chama o construtor abaixo
    public Aluno() { // cria os dados na memoria - sendo padrão do Java

    }

    public Aluno(String nomePadrao) {
        nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    }

    // SETTERS  e GETTERS do objeto
    // SET é para adicionar ou receber dados
    // GET é para resgatar ou obter valor do satirbut
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

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
}
