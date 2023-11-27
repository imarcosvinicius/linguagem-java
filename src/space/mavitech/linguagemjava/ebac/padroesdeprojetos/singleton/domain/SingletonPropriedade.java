package space.mavitech.linguagemjava.ebac.padroesdeprojetos.singleton.domain;

public class SingletonPropriedade {

    private static SingletonPropriedade singletonPropriedade;

    private String value;

    private SingletonPropriedade(String value) {
        this.value = value;
    }

    public static SingletonPropriedade getSingletonPropriedade(String value) {
        if (singletonPropriedade == null) {
            singletonPropriedade = new SingletonPropriedade(value);
        }
        return singletonPropriedade;
    }

    public String getValue() {
        return value;
    }
}
