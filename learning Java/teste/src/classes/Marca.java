package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Marca {
    String nome;
    List<Carro> carros = new ArrayList<Carro>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marca marca = (Marca) o;
        return Objects.equals(nome, marca.nome) && Objects.equals(carros, marca.carros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, carros);
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nome='" + nome + '\'' +
                ", \ncarros=" + carros +
                '}';
    }
}
