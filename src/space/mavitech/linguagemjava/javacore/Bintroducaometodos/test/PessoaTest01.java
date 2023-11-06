package space.mavitech.linguagemjava.javacore.Bintroducaometodos.test;

import space.mavitech.linguagemjava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jim Carrey");
        pessoa.setIdade(38);

        pessoa.imprime();
//        System.out.println(pessoa.getNome());
//        System.out.println(pessoa.getIdade());
    }

}