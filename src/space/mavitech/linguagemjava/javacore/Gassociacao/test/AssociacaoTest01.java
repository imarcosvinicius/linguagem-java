package space.mavitech.linguagemjava.javacore.Gassociacao.test;

import space.mavitech.linguagemjava.javacore.Gassociacao.domain.Aluno;
import space.mavitech.linguagemjava.javacore.Gassociacao.domain.Local;
import space.mavitech.linguagemjava.javacore.Gassociacao.domain.Professor;
import space.mavitech.linguagemjava.javacore.Gassociacao.domain.Seminario;

public class AssociacaoTest01 {

    public static void main(String[] args) {
        Local local = new Local("Av. dos Santos");
        Aluno aluno = new Aluno("João", 19);
        Professor professor = new Professor("Tião", "Chumbo");
        Aluno[] alunosSeminario = {aluno};
        Seminario seminario = new Seminario("Chumbo Grosso", alunosSeminario, local);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);
    }

}