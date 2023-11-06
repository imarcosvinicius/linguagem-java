package space.mavitech.linguagemjava.javacore.Bintroducaometodos.test;

import space.mavitech.linguagemjava.javacore.Bintroducaometodos.domain.Estudante;
import space.mavitech.linguagemjava.javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Jim Carrey";
        estudante1.idade = 38;
        estudante1.sexo = 'M';

        estudante2.nome = "Madona";
        estudante2.idade = 58;
        estudante2.sexo = 'F';

        ImpressoraEstudante.imprimeEstudante(estudante1);
        ImpressoraEstudante.imprimeEstudante(estudante2);

    }

}