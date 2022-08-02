package executavel;

import classes.Aluno;
import classes.Disciplina;
import constantes.StatusAluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        HashMap<String, List<Aluno>> mapAlunos = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            Aluno tmpAluno = new Aluno();

            System.out.println("\n\nNome do aluno " + (i + 1));
            tmpAluno.setNome(sc.nextLine());

            System.out.println("Idade");
            tmpAluno.setIdade(Integer.parseInt(sc.nextLine()));

            for (int j = 0; j < 2; j++) {
                Disciplina tmpDisciplina = new Disciplina();

                System.out.println("\nNome da disciplina" + (i + 1));
                tmpDisciplina.setDisciplina(sc.nextLine());

                System.out.println("Nota");
                tmpDisciplina.setNota(Double.parseDouble(sc.nextLine()));

                tmpAluno.getDisciplinas().add(tmpDisciplina);
            }

            alunos.add(tmpAluno);
        }

        mapAlunos.put(StatusAluno.APROVADO, new ArrayList<>());
        mapAlunos.put(StatusAluno.REPROVADO, new ArrayList<>());
        mapAlunos.put(StatusAluno.RECUPERACAO, new ArrayList<>());

        for (Aluno aluno :
                alunos) {
            if(aluno.getAprovado2().equalsIgnoreCase(StatusAluno.APROVADO))
                mapAlunos.get(StatusAluno.APROVADO).add(aluno);
            else if(aluno.getAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO))
                mapAlunos.get(StatusAluno.REPROVADO).add(aluno);
            else
                mapAlunos.get(StatusAluno.RECUPERACAO).add(aluno);
        }

        System.out.println("\n\nAprovados");
        for (Aluno aluno :
                mapAlunos.get(StatusAluno.APROVADO)) {
            System.out.println("\n" + aluno.getNome());
            System.out.println("media final: " + aluno.getMediaNota());
        }

        System.out.println("\n\nReprovados");
        for (Aluno aluno :
                mapAlunos.get(StatusAluno.REPROVADO)) {
            System.out.println("\n" + aluno.getNome());
            System.out.println("media final: " + aluno.getMediaNota());
        }

        System.out.println("\n\nRecuperação");
        for (Aluno aluno :
                mapAlunos.get(StatusAluno.RECUPERACAO)) {
            System.out.println("\n" + aluno.getNome());
            System.out.println("media final: " + aluno.getMediaNota());
        }
    }
}
