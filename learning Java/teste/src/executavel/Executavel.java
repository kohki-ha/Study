package executavel;

import classes.Carro;
import classes.Marca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {
        Marca marca = new Marca();
        int tamanhoCarro;

        Carro carro = new Carro();
        Scanner input = new Scanner(System.in);
        String nomeMarca;
        String nomeCarro;
        String cor;
        String combustivel;
        int anoLancamento;

        System.out.print("Nome da marca: ");
        nomeMarca = input.nextLine();
        marca.setNome(nomeMarca);

        System.out.print("Número de carros: ");
        tamanhoCarro = input.nextInt();

        for (int i = 0; i < tamanhoCarro; i++) {
            System.out.print("\nNome do carro " + i + ": ");
            input.nextLine();
            nomeCarro = input.nextLine();
            System.out.print("Cor: ");
            cor = input.nextLine();
            System.out.print("Combustível: ");
            combustivel = input.nextLine();
            System.out.print("Ano de lançamento: ");
            anoLancamento = input.nextInt();

            carro.setNome(nomeCarro);
            carro.setCor(cor);
            carro.setCombustivel(combustivel);
            carro.setAnoLancamento(anoLancamento);

            marca.getCarros().add(carro);
        }

        System.out.println(marca.toString());
    }
}
