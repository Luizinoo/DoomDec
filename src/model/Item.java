package model;

/**
* Uma classe abstrata que representa um item genérico.
*/
public abstract class Item {
    private String nome;
    private String tipo;
    private int valor;
    private String descricao;
    private String localizacao;
    private String dataAquisicao;

    /**
    * Construtor para a classe Item.
    *
    * @param nome          o nome do item
    * @param tipo          o tipo do item
    * @param valor         o valor do item
    * @param descricao     a descrição do item
    * @param localizacao   a localização do item
    * @param dataAquisicao a data de aquisição do item
    */
    public Item(
            String nome,
            String tipo,
            int valor,
            String descricao,
            String localizacao,
            String dataAquisicao) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.dataAquisicao = dataAquisicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
}