package space.mavitech.linguagemjava.javacore.Aintroducaoclasses.test;

import space.mavitech.linguagemjava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest {

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + ", Idade: " + professor.idade + ", SEXO: " + professor.sexo);
    }

}