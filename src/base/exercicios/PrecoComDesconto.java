package base.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class PrecoComDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite a porcentagem do desconto: ");

        double desconto = scanner.nextDouble();
        double percent = (preco * desconto / 100.0);
        String valorDesconto = String.format("%.2f", percent);
        String novoPreco = String.format("%.2f", preco - percent);

        System.out.println("Valor a ser pago: " + novoPreco + " e o valor economizado foi: " + valorDesconto);

        scanner.close();
    }

}
