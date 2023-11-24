package space.mavitech.linguagemjava.ebac.interfacess.domain;

public class Giz implements ICaneta {
    @Override
    public void escrever(String text) {
        System.out.println(text);
    }

    @Override
    public String getCor() {
        return "White";
    }
}
