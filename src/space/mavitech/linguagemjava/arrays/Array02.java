package space.mavitech.linguagemjava.arrays;

public class Array02 {

    public static void main(String[] args) {
        // Valores default em Arrays
        // byte, short, int, long, float e double = 0
        // char = '\u0000' ''
        // boolean = false
        // String = null

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";

        for (String i : nomes) {
            System.out.println(i);
        }
    }

}