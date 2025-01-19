package sintaxeBasica;

import java.util.Locale;

public class Execicio00 {
    public static void main(String[] args) {
        
        String produto1 = "Computador";
        String produto2 = "Mesa de escritório";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double media = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%s, cujo preço é $ %.2f\n", produto1, preco1);
        System.out.printf("%s, cujo preço é $ %.2f\n\n", produto2, preco2);

        System.out.printf("Registro: %d years old, code %d and gender: %c\n\n", age, code, gender);

        System.out.printf("Media com oito casas decimais: %.8f\n", media);
        System.out.printf("Arredondado (três casas decimais): %.3f\n", media);

        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal no formato dos EUA: %.3f", media);

    }
}