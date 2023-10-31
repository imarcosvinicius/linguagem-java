package space.mavitech.linguagemjava.sintaxe.condicionais;

import java.util.Scanner;

public class IfExercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salarioAnual = sc.nextDouble();

        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.75 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println(valorImposto);

        sc.close();

    }

}