 package uff.ic.lleme.tcc00328.s20212.exercicio.JogoDados;

public class Aplicacao {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Maria");
        Jogador jogador2 = new Jogador("Felipe");
        Jogador jogador3 = new Jogador("Pedro");
        
        Partida partida = new Partida();
        partida.add(jogador1);
        partida.add(jogador3);
        partida.add(jogador3);
        
        Dado[] dados = new Dado[2];
        dados[0] = new Dado();
        partida.start();
            
    }
}
