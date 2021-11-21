package uff.ic.lleme.tcc00328.s20212.exercicio.JogoDados;

public class Partida {
    private Jogador[] jogadores = new Jogador[10];
    private int i = 0;
    
    public void add(Jogador jogador) {
        jogadores{i++] = jogador;
    }
        
    public void start() {
        Dado[] dados = new Dado[2];
        dados[0] = new Dado();
        dados[1] = new Dado();
        boolean notGanhador=false;
        while (notGanhador)
            for(Jogador jogador: jogadores){
                jogador.sortear(dados);
            }
    }
}
