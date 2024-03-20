package base.exercicios;

import java.util.Scanner;

public class RelacionamentoDeOrdem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o valor 2: ");
        int n2 = scanner.nextInt();

        System.out.println("O número " + n1 + " é igual a " + n2 + "? " +(n1 == n2));
        System.out.println("O número " +n1 + " é diferente de " + n2 + "? " +(n1 != n2));
        System.out.println("O número " +n1 + " é maior que " + n2 + "? " +(n1 > n2));
        System.out.println("O número " +n1 + " é menor que " + n2 + "? " +(n1 < n2));
        System.out.println("O número " +n1 + " é maior ou igual a " + n2 + "? " +(n1 >= n2));
        System.out.println("O número " +n1 + " é menor ou igual a " + n2 + "? " +(n1 <= n2));

        scanner.close();
    }

}
