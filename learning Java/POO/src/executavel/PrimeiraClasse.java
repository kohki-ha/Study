package executavel;

import classes.Aluno;

import javax.swing.*;

public class PrimeiraClasse {
    public static void main(String[] args) {

        // new aluno() é uma instancia (criação de um objeto)
        // aluno 1 é uma referencia para o objeto aluno
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("José", 50);

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual a idade?");
        String nota1 = JOptionPane.showInputDialog("Qual a nota 1?");
        String nota2 = JOptionPane.showInputDialog("Qual a nota 2?");
        String nota3 = JOptionPane.showInputDialog("Qual a nota 3?");
        String nota4 = JOptionPane.showInputDialog("Qual a nota 4?");

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setNota1(Double.parseDouble(nota1));
        aluno1.setNota2(Double.parseDouble(nota2));
        aluno1.setNota3(Double.parseDouble(nota3));
        aluno1.setNota4(Double.parseDouble(nota4));

        System.out.println(aluno1.getNome() + " tem " + aluno1.getIdade() + " anos.");
        System.out.println("Média da nota é " + aluno1.getMediaNota());
        System.out.println("Resultado = " + (aluno1.getAprovado() ? "aprovado" : "reprovado"));
    }
}
