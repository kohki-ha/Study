package main;

import pessoa.Aluno;
import pessoa.Diretor;
import pessoa.Pessoa;
import pessoa.Secretario;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Diretor diretor = new Diretor();
        Secretario secretario = new Secretario();

        aluno.setNome("Alex");
        diretor.setNome("Aline");
        secretario.setNome("João");

        System.out.println(aluno.getNome());
        System.out.println(aluno.salario());

        System.out.println(diretor.getNome());
        System.out.println(diretor.salario());

        System.out.println(secretario.getNome());
        System.out.println(secretario.salario());

        Pessoa pessoa = new Aluno();
        pessoa = secretario;

        teste(aluno);
        teste(diretor);
        teste(secretario);
        teste(pessoa);
    }

    public static void teste(Pessoa pessoa) {
        System.out.println("\n\nPessoa: " + pessoa.getNome()
                + "\nsalario: " + pessoa.salario());
    }
}
