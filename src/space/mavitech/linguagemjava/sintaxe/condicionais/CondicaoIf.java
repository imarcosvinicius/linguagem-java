package space.mavitech.linguagemjava.sintaxe.condicionais;

public class CondicaoIf {

    public static void main(String[] args) {

        int idade = 22;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infatil";
        } else if (idade > 15 && idade < 18) {
            categoria = "Categoria Adolecente";
        } else {
            categoria = "Categoria adulta";
        }

        System.out.println(categoria);

    }

}