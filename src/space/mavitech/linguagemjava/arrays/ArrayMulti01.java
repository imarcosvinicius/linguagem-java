package space.mavitech.linguagemjava.arrays;

public class ArrayMulti01 {

    public static void main(String[] args) {

        int[][] dias = new int[3][3];
        dias[0][0] = 10;
        dias[0][1] = 20;
        dias[0][2] = 30;

        dias[1][0] = 5;
        dias[1][1] = 15;
        dias[1][2] = 25;

        /*for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }*/

        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }

}