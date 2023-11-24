package space.mavitech.linguagemjava.ebac.interfacess.domain;

public interface ICaneta {

    public void escrever(String text);

    public String getCor();

    default void escritaGenerica() {
        System.out.println("text");
    }

}