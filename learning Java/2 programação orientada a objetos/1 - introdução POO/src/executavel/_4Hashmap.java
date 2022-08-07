package executavel;

import classes.Aluno;
import classes.Disciplina;
import constantes.StatusAluno;
import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class _4Hashmap {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<Aluno>();

        // É uma lista que dentro temos uma chave que indentifica uma sequencia de valores
        HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

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

        maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
        maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
        maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

        for (Aluno aluno : alunos) {
            if (aluno.getAprovado2().equalsIgnoreCase(StatusAluno.APROVADO))
                maps.get(StatusAluno.APROVADO).add(aluno);
            else if (aluno.getAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO))
                maps.get(StatusAluno.RECUPERACAO).add(aluno);
            else
                maps.get(StatusAluno.REPROVADO).add(aluno);
        }

        System.out.println("-------------------APROVADOS-------------------");
        for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
            System.out.println(aluno.getNome());
            System.out.println(aluno.getAprovado2() + " com média " + aluno.getMediaNota() + "\n");
        }

        System.out.println("------------------RECUPERAÇÃO------------------");
        for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
            System.out.println(aluno.getNome());
            System.out.println(aluno.getAprovado2() + " com média " + aluno.getMediaNota() + "\n");
        }

        System.out.println("-------------------REPROVADOS------------------");
        for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
            System.out.println(aluno.getNome());
            System.out.println(aluno.getAprovado2() + " com média " + aluno.getMediaNota() + "\n");
        }
    } //main
}
