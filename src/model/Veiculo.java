package model;

/**
 * Uma classe que representa um veículo.
 */
public class Veiculo extends Item {
    private String identificacao;
    private String porte;

    /**
     * Construtor para a classe Veiculo.
     *
     * @param nome          o nome do veículo
     * @param tipo          o tipo do veículo
     * @param valor         o valor do veículo
     * @param descricao     a descrição do veículo
     * @param localizacao   a localização do veículo
     * @param dataAquisicao a data de aquisição do veículo
     * @param identificacao a identificação do veículo
     * @param porte         o porte do veículo
     */
    public Veiculo(
            String nome,
            String tipo,
            int valor,
            String descricao,
            String localizacao,
            String dataAquisicao,
            String identificacao,
            String porte) {
        super(nome, tipo, valor, descricao, localizacao, dataAquisicao);
        this.identificacao = identificacao;
        this.porte = porte;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    @Override
    public String toString() {
        return getNome()
                + "\n" + getTipo()
                + "\n" + getValor()
                + "\n" + getDescricao()
                + "\n" + getLocalizacao()
                + "\n" + getDataAquisicao()
                + "\n" + getIdentificacao()
                + "\n" + getPorte()
                + "\n";
    }
}