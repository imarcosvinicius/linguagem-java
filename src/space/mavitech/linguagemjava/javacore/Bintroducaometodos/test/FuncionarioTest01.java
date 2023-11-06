package space.mavitech.linguagemjava.javacore.Bintroducaometodos.test;

import space.mavitech.linguagemjava.javacore.Bintroducaometodos.domain.Funcionario;

import java.util.Locale;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Arnaldo");
        funcionario.setIdade(38);
        funcionario.setSalarios(new double[]{2000, 500, 1800});

        funcionario.imprimeDados();

    }

}