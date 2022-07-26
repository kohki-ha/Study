package classes;

import java.util.Objects;

public class Carro {
    String nome;
    String cor;
    String combustivel;
    int anoLancamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return anoLancamento == carro.anoLancamento && Objects.equals(nome, carro.nome) && Objects.equals(cor, carro.cor) && Objects.equals(combustivel, carro.combustivel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, combustivel, anoLancamento);
    }

    @Override
    public String toString() {
        return "\nCarro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }
}
