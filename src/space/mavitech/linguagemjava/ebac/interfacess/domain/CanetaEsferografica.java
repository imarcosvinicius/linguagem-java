package space.mavitech.linguagemjava.ebac.interfacess.domain;

public class CanetaEsferografica implements ICaneta {
    @Override
    public void escrever(String text) {
        System.out.println(text);
    }

    @Override
    public String getCor() {
        return "Blue";
    }

}
