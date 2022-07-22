package classes;

// classe para representar u aluno
public class Aluno {
    // atributos de Aluno
    // pro padrão os atributos são privados
    public String nome;
    public int idade;
    String daraNascimento;
    String registroGeral;
    String numeroCPF;
    String nomeEscola;
    String serieMatriculado;

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

    public String getDaraNascimento() {
        return daraNascimento;
    }

    public void setDaraNascimento(String daraNascimento) {
        this.daraNascimento = daraNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
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
}
