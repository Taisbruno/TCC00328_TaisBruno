package uff.ic.lleme.tcc00328.s20212.prova.p2.TaisBruno.Q1;

import java.util.ArrayList;

public class Dicionario {
    public ArrayList<Palavra> palavras = new ArrayList<>();

    public String toString(){
        int i = 1;
        String dicionario_string = "Dicionario:\n";
        for(Palavra palavra : palavras){
            dicionario_string += "--Palavra " + i + ": " + palavra + "\n";
            i += 1;
        } 
        return dicionario_string;
    }
}
