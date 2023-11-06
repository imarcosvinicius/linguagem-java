package space.mavitech.linguagemjava.javacore.poo.introducaometodos.domain;

public class Estudante {

    public String nome;
    public int idade;
    public char sexo;

    public void imprime() {
        System.out.printf("Nome: %s, Idade: %d, Sexo: %s\n", this.nome, this.idade, this.sexo);
    }

}