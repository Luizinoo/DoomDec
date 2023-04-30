package src.model;

public class Movel extends Item {
    private String dimencoes;

    public Movel(String nome, String tipo, int valor, String descricao, String localizacao, String dataAquisicao,
            String dimencoes) {
        super(nome, tipo, valor, descricao, localizacao, dataAquisicao);
        this.dimencoes = dimencoes;
    }

    public String getDimencoes() {
        return dimencoes;
    }

    public void setDimencoes(String dimencoes) {
        this.dimencoes = dimencoes;
    }
    public String toString() {
        return getNome()
                + "\n" + getTipo()
                + "\n" + getValor()
                + "\n" + getDescricao()
                + "\n" + getLocalizacao()
                + "\n" + getDataAquisicao()
                + "\n" + getDimencoes()
                + "\n";
    }
}