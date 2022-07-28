package executavel;

import classes.Aluno;
import classes.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class _1AlunoSemLista {
    public static void main(String[] args) {

        // new aluno() é uma instancia (criação de um objeto)
        // aluno 1 é uma referencia para o objeto aluno
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("José", 50);
        Aluno aluno4;
        Aluno aluno5;


        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual a idade?");

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));

        for (int i = 0; i < 4; i++) {
            String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina " + i + " ?");
            String nota = JOptionPane.showInputDialog("Nota da disciplina " + i);

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.parseDouble(nota));

            aluno1.getDisciplinas().add(disciplina);
        }

        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

        if (escolha == 0) {
            int continuarRemover = 0;
            int posicao = 0;

            while (continuarRemover == 0) {
                String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina a ser removida?");
                aluno1.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - posicao);
                posicao++;
                continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
            }

        }

        /*-------------------------------------------------------------------------------------------------------*/

        //System.out.println(aluno1.getNome() + " tem " + aluno1.getIdade() + " anos.");
        // Se o 'toString' não estiver configurado, mostra o endereço, se não, mostra a descrição
        System.out.println(aluno1.toString());
        System.out.println("Média da nota é " + aluno1.getMediaNota());
        System.out.println("Resultado = " + (aluno1.getAprovado() ? "aprovado\n" : "reprovado\n"));

        // Equals e Hashcodes
        // (diferenciar e comparar objetos)
        aluno4 = new Aluno();
        aluno5 = new Aluno();

        aluno4.setNome("Alex");
        aluno5.setNome("Alex");

        if (aluno4.equals(aluno5)) {
            System.out.println("Alunos 4 e 5 são iguais");
        } else {
            System.out.println("Alunos 4 e 5 são diferentes");
        }
    }
}
