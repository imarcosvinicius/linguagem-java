package space.mavitech.linguagemjava.javacore.Bintroducaometodos.domain;

public class ImpressoraEstudante {

    public static void imprimeEstudante(Estudante estudante) {
        System.out.printf("Nome: %s, Idade: %d, Sexo: %s\n", estudante.nome, estudante.idade, estudante.sexo);
    }

}