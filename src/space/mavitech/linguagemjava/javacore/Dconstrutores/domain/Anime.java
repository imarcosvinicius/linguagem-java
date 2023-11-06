package space.mavitech.linguagemjava.javacore.Dconstrutores.domain;

public class Anime {

    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime() {

    }

    public Anime(String nome, String tipo, int episodios, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public void imprime() {
        System.out.printf("NOME: %s TIPO: %s EPISÓDIOS: %d ESTUDIO: %s", this.nome, this.tipo, this.episodios, this.estudio);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}