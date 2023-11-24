package space.mavitech.linguagemjava.ebac.abstratas.domain;

public class Assalariado extends Empregado {

    private Double salario;

    @Override
    public Double vencimento() {
        return salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
