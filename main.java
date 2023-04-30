import java.util.ArrayList;
import java.util.Arrays;

import src.model.Imovel;
import src.model.Inventario;
import src.model.Item;
import src.model.Movel;
import src.model.Veiculo;

public class main {
        public static void main(String[] args) {

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

                Inventario volume = new Inventario(
                                "Epic Gomes",
                                false,
                                new ArrayList<Item>(Arrays.asList(mobilia, moradia, transporte)));

                System.out.println(transporte.toString());
                System.out.println(moradia.toString());
                System.out.println(mobilia.toString());
                System.out.println(volume.toString());
                System.out.println(volume.pesquisarItem("corvette").toString());
                volume.excluirItem("corvette");
                System.out.println(volume.toString());
        }
}
