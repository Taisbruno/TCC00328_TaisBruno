package uff.ic.lleme.tcc00328.s20212.prova.p1.TaisBruno;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileReader;
import java.util.Scanner;

/**
 * O formato de um arquivo de pedido segue o seguinte padrão:
 *      Em cada linha há um prato que o restaurante serve.
 *      Primeiro com o nome e depois com o valor.
 */

public class Prato {

    private String nome;
    private double preco;

    /**
        Construtor padrão que inicializa o prato
    */
    public Prato(String n, Double p){
        nome = n;
        preco = p;
    }

    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        return preco;
    }

    /**
        Método para ler os pratos de um arquivo de entrada
     */
    public static ArrayList<Prato> lerPratos(String arquivo) throws FileNotFoundException {
        ArrayList<Prato> cardapio = new ArrayList<Prato>();
        FileReader leitor = new FileReader(arquivo);
        Scanner scam = new Scanner(leitor);
        while(scam.hasNextLine()){
            String prato_string = scam.nextLine();
            String[] prato_array = prato_string.split(" ");
            Prato prato = new Prato(prato_array[0], Double.parseDouble(prato_array[1]));
            cardapio.add(prato);
        }
        return cardapio;
    }
}