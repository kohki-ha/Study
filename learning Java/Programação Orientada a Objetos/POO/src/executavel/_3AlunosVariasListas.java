package executavel;

import classes.Aluno;
import classes.Disciplina;
import constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3AlunosVariasListas {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<Aluno>();
        List<Aluno> aprovados = new ArrayList<Aluno>();
        List<Aluno> recuperacao = new ArrayList<Aluno>();
        List<Aluno> reprovado = new ArrayList<Aluno>();

        Scanner sc = new Scanner(System.in);
        int numeroAlunos;

        System.out.println("Quantidade de alunos:");
        numeroAlunos = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numeroAlunos; i++) {
            Aluno tmp = new Aluno();
            String nome;
            int idade;
            int numeroDisciplina;

            System.out.println("\nQual o nome do aluno " + (i + 1) + "?");
            nome = sc.nextLine();
            System.out.println("Qual a idade?");
            idade = Integer.parseInt(sc.nextLine());

            tmp.setNome(nome);
            tmp.setIdade(idade);

            System.out.println("Qual o quantidade de disciplinas");
            numeroDisciplina = Integer.parseInt(sc.nextLine());

            for (int j = 0; j < numeroDisciplina; j++) {
                Disciplina disciplina = new Disciplina();
                double nota;

                System.out.println("\nQual a disciplina " + (i + 1) + "?");
                nome = sc.nextLine();
                System.out.println("Qual a nota do aluno?");
                nota = Double.parseDouble(sc.nextLine());

                disciplina.setDisciplina(nome);
                disciplina.setNota(nota);

                tmp.getDisciplinas().add(disciplina);
            }
            alunos.add(tmp);
        }

        for (Aluno aluno : alunos) {
            if (aluno.getAprovado2().equalsIgnoreCase(StatusAluno.APROVADO))
                aprovados.add(aluno);
            else if (aluno.getAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO))
                recuperacao.add(aluno);
            else
                reprovado.add(aluno);
        }

        System.out.println("-------------------APROVADOS-------------------");
        for (Aluno aluno : aprovados) {
            System.out.println(aluno.getNome());
            System.out.println(aluno.getAprovado2() + "com média " + aluno.getMediaNota() + "\n");
        }

        System.out.println("------------------RECUPERAÇÃO------------------");
        for (Aluno aluno : recuperacao) {
            System.out.println(aluno.getNome());
            System.out.println(aluno.getAprovado2() + "com média " + aluno.getMediaNota() + "\n");
        }

        System.out.println("-------------------REPROVADOS------------------");
        for (Aluno aluno : reprovado) {
            System.out.println(aluno.getNome());
            System.out.println(aluno.getAprovado2() + "com média " + aluno.getMediaNota() + "\n");
        }
    } //main
}
