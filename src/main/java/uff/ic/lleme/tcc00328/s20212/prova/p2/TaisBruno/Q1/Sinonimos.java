package uff.ic.lleme.tcc00328.s20212.prova.p2.TaisBruno.Q1;

import java.util.ArrayList;

abstract public class Sinonimos {
    public String significado;
    public ArrayList<Palavra> palavras = new ArrayList<>();

    public Sinonimos(){

    }

    public Sinonimos(String significado){
        this.significado = significado;
    }

    public String toString(){
        return significado;
    }
}
