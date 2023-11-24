package space.mavitech.linguagemjava.ebac.abstratas.test;

import space.mavitech.linguagemjava.ebac.abstratas.domain.Assalariado;
import space.mavitech.linguagemjava.ebac.abstratas.domain.Comissionado;
import space.mavitech.linguagemjava.ebac.abstratas.domain.Empregado;
import space.mavitech.linguagemjava.ebac.abstratas.domain.Horista;

public class Program {

    public static void main(String[] args) {
        Assalariado empregado = new Assalariado();
        empregado.setNome("Jim");
        empregado.setSobreNome("Carrey");
        empregado.setCpf("11111111111");
        empregado.setSalario(2000D);
        imprimir(empregado);

        Comissionado comissionado = new Comissionado();
        comissionado.setNome("Eddie");
        comissionado.setSobreNome("Murphy");
        comissionado.setCpf("88888888888");
        comissionado.setTotalVenda(5000d);
        comissionado.setTotalComissao(0.1d);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setNome("Will");
        horista.setSobreNome("Smith");
        horista.setCpf("99999999999");
        horista.setValorHora(80d);
        horista.setHoraTrabalhada(40d);
        imprimir(horista);
    }

    public static void imprimir(Empregado empregado) {
        System.out.println("Funcionário: " + empregado.getNome() + " " + empregado.getSobreNome()
                + ", a receber: " + empregado.vencimento());
    }

}