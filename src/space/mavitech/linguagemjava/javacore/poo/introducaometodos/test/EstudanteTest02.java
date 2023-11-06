package space.mavitech.linguagemjava.javacore.poo.introducaometodos.test;

import space.mavitech.linguagemjava.javacore.poo.introducaometodos.domain.Estudante;

public class EstudanteTest02 {

    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Jim Carrey";
        estudante1.idade = 38;
        estudante1.sexo = 'M';

        estudante2.nome = "Madona";
        estudante2.idade = 58;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();

    }

}