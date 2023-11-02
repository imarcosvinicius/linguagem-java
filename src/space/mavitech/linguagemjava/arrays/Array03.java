package space.mavitech.linguagemjava.arrays;

public class Array03 {

    public static void main(String[] args) {
        int[] numeros0 = new int[3];
        int[] numeros1 = {1, 2, 3, 4, 5};
        int[] numeros2 = new int[]{1, 2, 3, 4, 5};

        for (int i : numeros2) {
            System.out.println(i);
        }

    }

}