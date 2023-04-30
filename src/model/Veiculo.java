package src.model;

public class Veiculo extends Item {
    private String identificacao;
    private char porte;

    public Veiculo(String nome, String tipo, int valor, String descricao, String localizacao, String dataAquisicao,
            String identificacao, char porte) {
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

    public char getPorte() {
        return porte;
    }

    public void setPorte(char porte) {
        this.porte = porte;
    }

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