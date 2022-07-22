package executavel;

import classes.Aluno;

public class PrimeiraClasse {
    public static void main(String[] args) {

        // new aluno() é uma instancia (criação de um objeto)
        // aluno 1 é uma referencia para o objeto aluno
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("José", 50);

        //aluno1.nome = "João";
        //aluno1.idade = 26;

        aluno1.setNome("João");
        aluno1.setIdade(26);

        System.out.println(aluno1.getNome() + " tem " + aluno1.getIdade() + " anos.");
    }
}
