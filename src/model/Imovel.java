package src.model;

/**
* Uma classe que representa um imóvel.
*/
public class Imovel extends Item {
    private int numComodos;
    private int area;

    /**
    * Constrói um objeto Imovel com os parâmetros especificados.
    *
    * @param nome          o nome do imóvel
    * @param tipo          o tipo do imóvel
    * @param valor         o valor do imóvel
    * @param descricao     a descrição do imóvel
    * @param localizacao   a localização do imóvel
    * @param dataAquisicao a data de aquisição do imóvel
    * @param numComodos    o número de cômodos do imóvel
    * @param area          a área do imóvel
    */
    public Imovel(
            String nome,
            String tipo,
            int valor,
            String descricao,
            String localizacao,
            String dataAquisicao,
            int numComodos,
            int area) {
        super(nome, tipo, valor, descricao, localizacao, dataAquisicao);
        this.numComodos = numComodos;
        this.area = area;
    }

    public int getNumComodos() {
        return numComodos;
    }

    public void setNumComodos(int numComodos) {
        this.numComodos = numComodos;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    @Override
    public String toString() {
        return getNome()
                + "\n" + getTipo()
                + "\n" + getValor()
                + "\n" + getDescricao()
                + "\n" + getLocalizacao()
                + "\n" + getDataAquisicao()
                + "\n" + getNumComodos()
                + "\n" + getArea()
                + "\n";
    }
}