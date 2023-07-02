package control;

import java.util.ArrayList;
import java.util.Arrays;

import model.Imovel;
import model.Inventario;
import model.Item;
import model.Movel;
import model.Veiculo;
import view.App;

/**
* Classe responsável por controlar o inventário.
*/
public class ControleInventario {

    /**
    * O inventário.
    */
    public static Inventario inv;

	/**
    * Construtor da classe ControleInventario.
    * Preenche o inventário com dados iniciais.
    */
    ControleInventario() {

    Veiculo transporte;
        transporte = new Veiculo(
            "corvette",
            "carro",
            250000,
            "amarelo com rodas aro 20",
            "brasilia",
            "27/07/2022",
            "pkq2131",
            'p');
    Imovel moradia;
	    moradia = new Imovel(
            "casa de praia",
            "casa",
            1000000,
            "casa laranja na praia",
            "maceio",
            "27/03/2009",
            7,
            230);
    Movel mobilia;
        mobilia = new Movel(
            "TV",
            "eletronico",
            15000,
            "90 polegadas branca",
            "casa de praia",
            "15/07/2020",
            "90");

    inv = new Inventario(
        "Epic Gomes",
        false,
        new ArrayList<Item>(Arrays.asList(mobilia, moradia, transporte)));
    }
	
    /**
    * Método principal para executar o programa.
    *
    * @param args os argumentos de linha de comando
    */
	public static void main(String[] args) {
        new App(inv);
    }
}