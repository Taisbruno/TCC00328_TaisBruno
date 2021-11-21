package uff.ic.lleme.tcc00328.s20212.exercicio.JogoDados;

import java.util.Random;

public class Dado {
    private Integer valor = null;
    public Integer getValor() {
        return valor;
    }
    
    public void sortear() {
        valor = (new Random()).nextInt(5)+1 ;
}
    public void reset() {
        valor = null;
    }
}
