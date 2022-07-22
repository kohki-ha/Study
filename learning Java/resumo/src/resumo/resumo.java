package resumo;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class resumo {

    // variavel global
    static int idadeGlobal = 31;

    // main é um método auto executavel em Java
    public static void main(String[] args) {

        // variaveis locais
        char letra = 'A';
        int maiorIdade = 18;
        int idadeIdoso = 60;
        int idadeJoven = 16;
        int totalIdade;

        double mediaIdade;
        double nota1 = 5.4;
        double nota2 = 6.7;
        double notaFinal;
        String situacao;
        String nome = "Alberto";
        String cpf = "111.111.111-11";

        int quantidadeCarros;

        Scanner sc = new Scanner(System.in);

        // escreve texto no console
        System.out.println("Letra: " + letra);

        System.out.println("\nMaior idade: " + maiorIdade);
        System.out.println("Idade idoso: " + idadeIdoso);
        System.out.println("Idade jovem: " + idadeJoven);
        System.out.println("CPF: " + cpf);

        System.out.println("\nIdade global pela main: " + idadeGlobal);

        // invocar methodo2
        metodo2();

        // operações aritméticas
        totalIdade = maiorIdade + idadeIdoso + idadeJoven + idadeGlobal;
        mediaIdade = (double) totalIdade / 4;
        notaFinal = (nota1 + nota2) / 2;

        System.out.println("\nTotal idade: " + totalIdade);
        System.out.println("Media idade: " + mediaIdade);
        System.out.println("\nNota final: " + notaFinal);


        // operações lógicas
        if (notaFinal >= 6)
            System.out.println("\nAprovado!");
        else if (notaFinal > 3 && notaFinal < 6)
            System.out.println("\nRecuperação...");
        else
            System.out.println("\nReprovado");

        // operador ternário
        situacao = notaFinal >= 6 ? "aprovado" : "reprovado";
        situacao = notaFinal >= 6 ? "aprovado" : notaFinal > 3 && notaFinal < 6 ? "recuperação" : "reprovado";
        System.out.println("\n" + situacao);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // entrada de dados

        quantidadeCarros = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros"));
        System.out.println("Quantidade de carros: " + quantidadeCarros);

        JOptionPane.showMessageDialog(null, "Numero de carros: " + quantidadeCarros);

        nome = sc.nextLine();

        System.out.println("Novo nome: " + nome);
    }

    public static void metodo2() {
        System.out.println("\nIdade global pelo metodo2: " + idadeGlobal);
    }

}
