package src.model;

public class Imovel extends Item {
    private int numComodos;
    private int area;

    public Imovel(String nome, String tipo, int valor, String descricao, 
            String localizacao, String dataAquisicao, int numComodos, int area) {
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