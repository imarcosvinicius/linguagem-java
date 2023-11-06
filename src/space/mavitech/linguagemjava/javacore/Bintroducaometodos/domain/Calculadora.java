package space.mavitech.linguagemjava.javacore.Bintroducaometodos.domain;

public class Calculadora {

    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public int subtracao(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    public int divisao(int num1, int num2) {
        return num1 / num2;
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do metodo");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num :numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num :numeros) {
            soma += num;
        }
        System.out.println(soma);
    }


}