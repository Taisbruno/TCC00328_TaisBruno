package uff.ic.lleme.tcc00328.s20212.prova.p2.TaisBruno.Q2;

import java.util.ArrayList;

public class Soma extends Thread {
    ArrayList<Double> numeros = new ArrayList<>();
    Double soma = 0.0;

    public Soma(ArrayList<Double> numeros){
        this.numeros = numeros;
    }

    public void run(){
        for(Double numero : numeros){   
            soma += numero;
        }
    }
}
