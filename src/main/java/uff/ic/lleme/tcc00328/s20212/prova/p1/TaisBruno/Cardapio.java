package uff.ic.lleme.tcc00328.s20212.prova.p1.TaisBruno;

import java.util.ArrayList;


/**
    Guarda o cardapio do restaurante e a quantidadde de pratos solicitados hoje
 */
public class Cardapio {
    private ArrayList<Prato> pratos = new ArrayList<Prato>();
    private ArrayList<Double> quantidade_solicitada = new ArrayList<Double>();
    private int total_pedidos = 0;

    /**
     * Adiciona um prato no cardápio
     */
    public void addPrato(Prato p){
        pratos.add(p);
        quantidade_solicitada.add(0.0);
    }

    /**
     * Pega o valor do prato já computado com a quantidade. Armazena o numero de pratos solicitados.
     */
    public Double getValor(String p, int q){
        for(int i = 0; i < pratos.size(); ++i){
            Prato prato = pratos.get(i);
            if(prato.getNome().equals(p)){
                quantidade_solicitada.set(i, quantidade_solicitada.get(i) + q);
                total_pedidos += q;
                return prato.getPreco() * q;
            }
        }
        return 0.0;
    };

    /**
     * Imprime no stdout o percentual de cada prato pedido em relacao ao total.
     */
    public void calculaPercentual(){
        for(int i = 0; i < pratos.size(); ++i){
            Prato prato = pratos.get(i);
            Double quantidade = quantidade_solicitada.get(i);
            System.out.println(prato.getNome() + " " + (quantidade / total_pedidos)* 100 + "%");
        }
    }

    public int getTotalPedidos(){
        return total_pedidos;
    }
}
