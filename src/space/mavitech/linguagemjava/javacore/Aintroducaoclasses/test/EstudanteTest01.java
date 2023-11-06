package space.mavitech.linguagemjava.javacore.Aintroducaoclasses.test;

import space.mavitech.linguagemjava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Hinata";
        estudante.idade = 22;
        estudante.sexo = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }

}