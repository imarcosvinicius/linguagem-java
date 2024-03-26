package base.exercicios;

import java.util.Scanner;

public class ConversorDolarReal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor em dolár: ");
        double dolar = scanner.nextDouble();
        System.out.print("Informe a cotação atual: ");
        double cotacao = scanner.nextDouble();
        double real = dolar * cotacao;

        System.out.printf("O valor de %.2f dolares com a contação atual em reais é R$ %.2f", dolar, real);

        scanner.close();
    }

}
