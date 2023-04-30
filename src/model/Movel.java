package src.model;

public class Movel extends Item {
    private String tamanho;

    public Movel(String nome, String tipo, int valor, String descricao, String localizacao, String dataAquisicao,
            String tamanho) {
        super(nome, tipo, valor, descricao, localizacao, dataAquisicao);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}