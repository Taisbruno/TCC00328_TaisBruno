package uff.ic.lleme.tcc00328.s20212.prova.p1.TaisBruno;

public class Item {

    private String prato_pedido;
    private int quantidade;

    /**
     * Pega o nome do prato
     */
    public String getPrato(){
        return prato_pedido;
    }

    /**
     * Pega a quantidade do prato
     */
    public int getQuantidade(){
        return quantidade;
    }

    /**
     * Construtor padrão.
     */
    public Item(String pp, int q){
        prato_pedido = pp;
        quantidade = q;
    }
}
