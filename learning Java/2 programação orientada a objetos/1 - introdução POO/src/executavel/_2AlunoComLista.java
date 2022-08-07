package executavel;

import classes.Aluno;
import classes.Disciplina;
import constantes.StatusAluno;
import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class _2AlunoComLista {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<Aluno>();
        int numeroAlunos;
        int numeroDisciplinas;

        Scanner input = new Scanner(System.in);
        String nomeAluno;
        int idade;
        String nomeDisciplina;
        double nota;

        System.out.println("\nNumero de alunos:");
        numeroAlunos = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numeroAlunos; i++) {
            Aluno tmpAluno = new Aluno();

            System.out.println("\nNome do aluno " + (i + 1));
            nomeAluno = input.nextLine();
            System.out.println("\nIdade");
            idade = input.nextInt();

            tmpAluno.setNome(nomeAluno);
            tmpAluno.setIdade(idade);

            System.out.println("\nNumero de disciplinas");
            numeroDisciplinas = input.nextInt();
            input.nextLine();

            for (int j = 0; j < numeroDisciplinas; j++) {
                Disciplina tmpDisciplina = new Disciplina();

                System.out.println("\nNome da disciplina " + (j + 1));
                nomeDisciplina = input.nextLine();
                System.out.println("Nota");
                nota = input.nextDouble();

                tmpDisciplina.setDisciplina(nomeDisciplina);
                tmpDisciplina.setNota(nota);

                tmpAluno.getDisciplinas().add(tmpDisciplina);
                input.nextLine();
            }

            alunos.add(tmpAluno);
        }

        System.out.println("------------------------------------------------------------------------------------");

        // buscar um aluno
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase("Thales")) {
                System.out.println(aluno);
                System.out.println("Média do aluno: " + String.format("%.2f", aluno.getMediaNota()));
                System.out.println("Resultado : " + (aluno.getAprovado() ? StatusAluno.APROVADO : StatusAluno.REPROVADO));
                System.out.println("------------------------------------------------------------------------------------");
                break;

            }
        }

        // remover um aluno da lista
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase("Alex")) {
                alunos.remove(aluno);
                System.out.println("Aluno removido\n");
                break;
            }
        }

        // substituir um aluno da lista
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);

            if (aluno.getNome().equalsIgnoreCase("Bruno")) {
                Aluno trocar = new Aluno();
                trocar.setNome("Novo nome");
                trocar.setIdade(55);

                for (int j = 0; j < 2; j++) {
                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina("Nova disciplina " + (j + 1));
                    disciplina.setNota(3.2 * (j + 1));

                    trocar.getDisciplinas().add(disciplina);
                }

                alunos.set(i, trocar);
            }
        }

        System.out.println("Alunos que sobraram na lista");
        for (Aluno aluno : alunos) {
            System.out.println("\n" + aluno.getNome());

            for (Disciplina disciplina : aluno.getDisciplinas()) {
                System.out.println("Disciplina: " + disciplina.getDisciplina());
                System.out.println("Nota: " + disciplina.getNota());
            }

            System.out.println("Média do aluno: " + String.format("%.2f", aluno.getMediaNota()));
            System.out.println("Resultado : " + (aluno.getAprovado() ? StatusAluno.APROVADO : StatusAluno.REPROVADO));
            System.out.println("------------------------------------------------------------------------------------");
        }

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Outra forma de fazer");
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);

            System.out.println(aluno.getNome());

            for (int j = 0; j < aluno.getDisciplinas().size(); j++) {
                Disciplina disciplina = aluno.getDisciplinas().get(j);
                System.out.println("Disciplina: " + disciplina.getDisciplina());
                System.out.println("Nota: " + disciplina.getNota());
            }

            System.out.println("Média do aluno: " + String.format("%.2f", aluno.getMediaNota()));
            System.out.println("Resultado : " + (aluno.getAprovado() ? StatusAluno.APROVADO : StatusAluno.REPROVADO));
            System.out.println("------------------------------------------------------------------------------------");
        }
    }
}
