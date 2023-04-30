package src.model;

import java.util.ArrayList;

public class Inventario {
    private String nomeProprietario;
    private boolean proprietarioPessoaFisica;
    private ArrayList<Item> itens;

    public Inventario(String nomeProprietario, boolean proprietarioPessoaFisica, ArrayList<Item> itens) {
        this.nomeProprietario = nomeProprietario;
        this.proprietarioPessoaFisica = proprietarioPessoaFisica;
        this.itens = itens;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public boolean isProprietarioPessoaFisica() {
        return proprietarioPessoaFisica;
    }

    public void setProprietarioPessoaFisica(boolean proprietarioPessoaFisica) {
        this.proprietarioPessoaFisica = proprietarioPessoaFisica;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
}