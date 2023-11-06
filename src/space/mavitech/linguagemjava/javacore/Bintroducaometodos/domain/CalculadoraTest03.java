package space.mavitech.linguagemjava.javacore.Bintroducaometodos.domain;

public class CalculadoraTest03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] arr = {1, 2, 3, 4, 5};

        calculadora.somaArray(arr);
        calculadora.somaVarArgs(5, 10, 15, 20);
    }

}