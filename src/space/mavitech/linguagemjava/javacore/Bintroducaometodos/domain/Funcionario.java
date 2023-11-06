package space.mavitech.linguagemjava.javacore.Bintroducaometodos.domain;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double mediaSalario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMediaSalario() {
        return mediaSalario;
    }


    public void imprimeDados() {
        System.out.printf("Nome: %s, Idade: %d", this.nome, this.idade);
        if (this.salarios == null) {
            return;
        } else {
            for (double salario : salarios) {
                System.out.print(" " + String.format(", Salário: %.2f", salario));
            }
        }
        System.out.println();
        imprimeMediaSalarios();
    }

    private void imprimeMediaSalarios() {

        if (this.salarios == null) {
            return;
        } else {
            for (double salario : this.salarios) {
                mediaSalario += salario;
            }
            mediaSalario /= salarios.length;
            System.out.printf("Média salárial: %.2f", mediaSalario);
        }
    }

}
