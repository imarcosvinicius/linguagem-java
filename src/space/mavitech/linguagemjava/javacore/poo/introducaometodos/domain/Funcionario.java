package space.mavitech.linguagemjava.javacore.poo.introducaometodos.domain;

import java.util.Arrays;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

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
        double mediaSalario = 0;
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
