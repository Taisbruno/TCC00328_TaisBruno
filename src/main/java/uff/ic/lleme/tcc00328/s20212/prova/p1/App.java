package uff.ic.lleme.tcc00328.s20212.prova.p1;

import java.util.ArrayList;
import java.io.FileNotFoundException;

public class App {

    public static void main (String[] args) throws FileNotFoundException {
        String pedidosArquivo = "src/main/java/uff/ic/lleme/tcc00328/s20212/prova/p1/pedidos.txt";
        String pratoArquivo = "src/main/java/uff/ic/lleme/tcc00328/s20212/prova/p1/pratos.txt";

        ArrayList<Prato> pratos = Prato.lerPratos(pratoArquivo);
        Cardapio cardapio = new Cardapio();
        for(Prato prato : pratos)
            cardapio.addPrato(prato);

        ArrayList<Pedido> pedidos = Pedido.lerPedidos(pedidosArquivo);
        int numero_pedido = 1;
        for(Pedido pedido : pedidos){
            Double conta = 0.0;
            System.out.println("Items do pedido " + numero_pedido + ": ");
            for(Item item : pedido.getItems()){
                System.out.println(item.getPrato() + " " + item.getQuantidade());
                //Vamos achar o valor do prato no cardapio e contabilizar a conta!
                conta += cardapio.getValor(item.getPrato(), item.getQuantidade());
            }
            System.out.println("Conta a pagar: " + conta + "\n");
            numero_pedido++;
        }

        System.out.println("Acabou o dia de serviço! Sextou! Quantidade de pedidos: " + cardapio.getTotalPedidos());
        System.out.println("Percentual de cada prato pedido hoje em relacao ao total de items pedidos: ");
        cardapio.calculaPercentual();


    }
    
}
