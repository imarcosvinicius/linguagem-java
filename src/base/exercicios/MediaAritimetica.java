package base.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaAritimetica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        double nota = 0.0;
        String resultado;

        for (int i = 1; i <=3; i++) {
            System.out.print("Informe a nota 1: ");
            nota += scanner.nextDouble();
        }

        resultado = String.format("%.1f",(nota / 3));

        System.out.printf("\nMédia aritmética do aluno: " + resultado);

        scanner.close();
    }

}
