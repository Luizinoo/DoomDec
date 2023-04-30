package src.model;

public class Imovel extends Item {
    private int comodos;
    private int area;

    public Imovel(String nome, String tipo, int valor, String descricao, String localizacao, String dataAquisicao,
            int comodos, int area) {
        super(nome, tipo, valor, descricao, localizacao, dataAquisicao);
        this.comodos = comodos;
        this.area = area;
    }

    public int getComodos() {
        return comodos;
    }

    public void setComodos(int comodos) {
        this.comodos = comodos;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}