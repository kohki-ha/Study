package pessoa;

public class Secretario extends Pessoa {
    String registro;
    String cargo;
    String experiencia;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public double salario() {
        return 1800.80 * 0.9;
    }
}
