package model;

/**
* Uma classe que representa um móvel.
*/
public class Movel extends Item {
    private String dimencoes;

    /**
    * Construtor para a classe Movel.
    *
    * @param nome          o nome do móvel
    * @param tipo          o tipo do móvel
    * @param valor         o valor do móvel
    * @param descricao     a descrição do móvel
    * @param localizacao   a localização do móvel
    * @param dataAquisicao a data de aquisição do móvel
    * @param dimencoes     as dimensões do móvel
    */
    public Movel(
            String nome,
            String tipo,
            int valor,
            String descricao,
            String localizacao,
            String dataAquisicao,
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