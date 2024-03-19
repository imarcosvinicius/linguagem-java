package base.exercicios;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SELECIONE O TIPO DE TABUADA: \n");
        System.out.println("SOMA: 1 - SUBTRAÇÃO: 2 - DIVISÃO: 3 - MULTIPLICAÇÃO: 4");

        System.out.print("Digite aqui: ");
        int tipoTabuada = scanner.nextInt();

        System.out.print("DIGITE O NÚMERO DA TABUADA DESEJADA: ");
        int tabuada = scanner.nextInt();
        
        System.out.println("#####################################\n");

        if (tipoTabuada == 1) soma(tabuada);
        else if (tipoTabuada == 2) subtracao(tabuada);
        else if (tipoTabuada == 3) divisao(tabuada);
        else multiplicacao(tabuada);

        System.out.println("\n###############  FIM  ###############");

        scanner.close();
    }

    private static void soma(int tabuada) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(tabuada + " + " + i + " = " + (tabuada + i));
        }
    }

    private static void subtracao(int tabuada) {
        int count = tabuada;
        for (int i = 0; i <= 10; i++) {
            System.out.println(count++ + " - " + tabuada + " = " + i);
        }
    }

    private static void divisao(int tabuada) {
        int count = tabuada;
        System.out.println(tabuada + " ÷ " + tabuada + " = 1");
        for (int i = 2; i <= 10; i++) {
            System.out.println((count += tabuada) + " ÷ " + tabuada + " = " + i);
        }
    }

    private static void multiplicacao(int tabuada) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
    }

}
