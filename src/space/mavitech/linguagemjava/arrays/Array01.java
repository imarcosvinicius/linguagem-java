package space.mavitech.linguagemjava.arrays;

public class Array01 {

    public static void main(String[] args) {

        int[] idade = new int[3];
        idade[0] = 32;
        idade[1] = 22;
        idade[2] = 18;

        for (int i : idade) {
            System.out.println(i);
        }

    }

}