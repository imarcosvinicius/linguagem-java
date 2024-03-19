package base.exercicios;

import java.util.Scanner;

public class DiasDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int anos = scanner.nextInt();
        int dias = anos * 365;
        System.out.println("Sua idade em dias é aproximada de " + dias + " dias.");

        scanner.close();
    }
}
