package uff.ic.lleme.tcc00328.s20212.prova.p1.TaisBruno;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileReader;
import java.util.Scanner;

/**
 * O formato de um arquivo de pedido segue o seguinte padrão:
 *          'n' -- Linha que contém o número de itens no pedido
 *          n linhas com os itens do pedido
 */

public class Pedido {

    private ArrayList<Item> items = new ArrayList<Item>();

    /**
     * Adiciona um novo item no pedido
     */
    public void adicionaItem(Item i){
        items.add(i);
    }

    /**
     * Retorna a lista de itens do pedido
     */
    public ArrayList<Item> getItems(){
        return items;
    }

    /**
     * Le um arquivo com pedidos
     */
    public static ArrayList<Pedido> lerPedidos(String arquivo) throws FileNotFoundException {
        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
        FileReader leitor = new FileReader(arquivo);
        Scanner scam = new Scanner(leitor);
        while(scam.hasNextInt()){
            int quantidade_items = Integer.parseInt(scam.nextLine());
            Pedido pedido = new Pedido();
            for(int i = 0; i < quantidade_items; i++){
                String item_string = scam.nextLine();
                String[] item_array = item_string.split(" ");
                Item item = new Item(item_array[0], Integer.parseInt(item_array[1]));
                pedido.adicionaItem(item);
            }
            pedidos.add(pedido);
        }
        return pedidos;
    }
}
