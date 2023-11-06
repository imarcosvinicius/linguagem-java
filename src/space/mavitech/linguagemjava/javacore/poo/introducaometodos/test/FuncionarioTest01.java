package space.mavitech.linguagemjava.javacore.poo.introducaometodos.test;

import space.mavitech.linguagemjava.javacore.poo.introducaometodos.domain.Funcionario;

import java.util.Locale;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Arnaldo";
        funcionario.idade = 37;
//        funcionario.salarios = new double[]{2000, 500, 1800};

        funcionario.imprimeDados();

    }

}