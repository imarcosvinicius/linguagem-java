package space.mavitech.linguagemjava.ebac.composicao.test;

import space.mavitech.linguagemjava.ebac.composicao.domain.Banco;
import space.mavitech.linguagemjava.ebac.composicao.domain.ContaCorrente;
import space.mavitech.linguagemjava.ebac.composicao.domain.ContaPoupanca;

public class Program01 {

    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.setCodigo(10L);
        banco.setNome("NiNeBank");

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(10D);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(10D);

    }

}
