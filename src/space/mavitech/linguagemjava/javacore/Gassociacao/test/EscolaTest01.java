package space.mavitech.linguagemjava.javacore.Gassociacao.test;

import space.mavitech.linguagemjava.javacore.Gassociacao.domain.Escola;
import space.mavitech.linguagemjava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {

    public static void main(String[] args) {
        Professor professor1 = new Professor("Jim Carrey");
        Professor professor2 = new Professor("Eddie Murphy");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Harvard", professores);

        escola.imprime();
    }

}