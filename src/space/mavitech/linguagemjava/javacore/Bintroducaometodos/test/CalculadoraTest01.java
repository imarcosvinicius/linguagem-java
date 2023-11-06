package space.mavitech.linguagemjava.javacore.Bintroducaometodos.test;

import space.mavitech.linguagemjava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest01 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.soma(22, 14));
        System.out.println(calculadora.subtracao(23, 14));
        System.out.println(calculadora.multiplicacao(23, 14));
        System.out.println(calculadora.divisao(23, 14));

    }

}