package space.mavitech.linguagemjava.ebac.composicao.domain;

public class ContaCorrente {

    private Banco banco;
    private Double saldo;
    private Double ChequeEspecial;


    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getChequeEspecial() {
        return ChequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        ChequeEspecial = chequeEspecial;
    }
}
