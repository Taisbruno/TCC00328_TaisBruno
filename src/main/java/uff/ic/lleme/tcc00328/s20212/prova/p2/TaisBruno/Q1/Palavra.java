package uff.ic.lleme.tcc00328.s20212.prova.p2.TaisBruno.Q1;

import java.util.ArrayList;

public class Palavra {
    public String fonetica;
    public String grafia;
    public ArrayList<Sinonimos> significados = new ArrayList<>();

    public Palavra() {   

    }

    public Palavra(String grafia, String fonetica){
        this.grafia = grafia;
        this.fonetica = fonetica;
    }

    public String toString(){
        int i = 1;
        String palavra_string = grafia + " / " + fonetica + "\n";
        for(Sinonimos significado : significados){
            palavra_string += "---Significado " + i + ": " + significado + "\n";
            i += 1;
        }
        return palavra_string;
    }
}
