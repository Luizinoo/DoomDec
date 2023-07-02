package model;

import java.util.ArrayList;

/**
*Classe que representa um inventário.
*/
public class Inventario {
    private String nomeProprietario;
    private boolean proprietarioPessoaFisica;
    private ArrayList<Item> itens;

    /**
    * Constrói um objeto Inventario com os parâmetros especificados.
    *
    * @param nomeProprietario       o nome do proprietário do inventário
    * @param proprietarioPessoaFisica um indicador se o proprietário é uma pessoa física (true) ou não (false)
    * @param itens                  a lista de itens do inventário
    */
    public Inventario(
            String nomeProprietario,
            boolean proprietarioPessoaFisica,
            ArrayList<Item> itens) {
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

    @Override
    public String toString() {
        String result;
        result = getNomeProprietario();
        for (Item item : itens) {
            result += item.getNome();
        }
        return result;
    }

    /**
    * Cadastra um novo item no inventário.
    *
    * @param novoItem o novo item a ser cadastrado
    */
    public void cadastrarItem(Item novoItem) {
        itens.add(novoItem);
    }

    /**
    * Pesquisa um item no inventário pelo nome.
    *
    * @param nome o nome do item a ser pesquisado
    * @return o item encontrado ou null se não encontrado
    */
    public Item pesquisarItem(String nome) {
        for (Item item : itens) {
            if (item.getNome() == nome) {
                return item;
            }
        }
        return null;
    }

    /**
    * Exclui um item do inventário pelo nome.
    *
    * @param nome o nome do item a ser excluído
    */
    public void excluirItem(String nome) {
        itens.remove(pesquisarItem(nome));
    }

    /**
    * Adiciona um item à lista de itens do inventário.
    *
    * @param item o item a ser adicionado
    */
    public void addItem(Item item){
        itens.add(item);
    } 
}