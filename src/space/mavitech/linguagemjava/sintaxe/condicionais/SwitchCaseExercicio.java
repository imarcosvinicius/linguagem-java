package space.mavitech.linguagemjava.sintaxe.condicionais;

import java.util.Scanner;

public class SwitchCaseExercicio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        byte dia = scan.nextByte();

        switch (dia) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia utíl");
                break;
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Opção inválida");
        }

        scan.close();
    }

}