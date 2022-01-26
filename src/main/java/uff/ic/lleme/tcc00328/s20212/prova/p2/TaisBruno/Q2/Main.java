package uff.ic.lleme.tcc00328.s20212.prova.p2.TaisBruno.Q2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Double> numeros = new ArrayList<>(Arrays.asList(61.5,   9.5,  46.5,   1.5,  51.5,  80.5,  86.5,  23.5,  22.5,  38.5,  75.5,  99.5,  45.5,  12.5,  20.5,   2.5,   5.5,  17.5,  78.5,  29.5,  33.5,  11.5,  39.5,  32.5,  50.5,  67.5,  63.5,  88.5,  43.5,  44.5,  34.5,  74.5,  54.5,  41.5,  49.5,   8.5,  94.5,  72.5,  15.5,  91.5,  83.5,  93.5,   6.5,  42.5,  68.5,  66.5,  73.5,   4.5,  35.5,  18.5,  89.5,  10.5,  28.5,  52.5,  31.5,  95.5,  36.5,  70.5, 100.5,   3.5,  77.5,  92.5,  25.5,  96.5,  37.5,  27.5,  65.5,  87.5,  82.5,  58.5,  56.5,  98.5,  60.5,  13.5,  62.5,  48.5,  64.5,  26.5,  59.5,  40.5,  79.5,  21.5,  53.5,  57.5,  76.5,  30.5,  24.5,  85.5,  16.5,   7.5,  90.5,  55.5,  69.5,  19.5,  84.5,  47.5,  81.5,  14.5,  71.5,  97.5));
        Double media = 0.0;    
        Double qtd_thread;
        int intervalo; 
        int comeco;
        ArrayList<Soma> threads = new ArrayList<>();
        
        //Tirando a media sequencial
        for(Double numero : numeros){   
            media += numero;
        }
        media = media/numeros.size();
        System.out.println("Qtd de numeros: " + numeros.size());
        System.out.println("Media sequencial: " + media);
        
        //Tirando a media com 2 threads
        media = 0.0;
        qtd_thread = (double) 2;
        intervalo = (int) Math.ceil(numeros.size()/qtd_thread);
        comeco = 0;
        for(int i = 0; i < qtd_thread; ++i){
            threads.add(new Soma(new ArrayList<Double>(numeros.subList(comeco, Math.min(comeco+intervalo, numeros.size())))));
            comeco += intervalo;
        }
        for(Thread thread : threads) thread.run();
        for(Thread thread : threads) thread.join();
        for(Soma thread : threads) media += thread.soma;
        System.out.println("Media com duas threads: " + media/numeros.size());

        //Tirando a media com 4 threads
        threads.clear();
        media = 0.0;
        qtd_thread = (double) 4;
        intervalo = (int) Math.ceil(numeros.size()/qtd_thread);
        comeco = 0;
        for(int i = 0; i < qtd_thread; ++i){
            threads.add(new Soma(new ArrayList<Double>(numeros.subList(comeco, Math.min(comeco+intervalo, numeros.size())))));
            comeco += intervalo;
        }
        for(Thread thread : threads) thread.run();
        for(Thread thread : threads) thread.join();
        for(Soma thread : threads) media += thread.soma;
        System.out.println("Media com quatro threads: " +  media/numeros.size());

        //Tirando a media com 8 threads
        threads.clear();
        media = 0.0;
        qtd_thread = (double) 8;
        intervalo = (int) Math.ceil(numeros.size()/qtd_thread);
        comeco = 0;
        for(int i = 0; i < qtd_thread; ++i){
            threads.add(new Soma(new ArrayList<Double>(numeros.subList(comeco, Math.min(comeco+intervalo, numeros.size())))));
            comeco += intervalo;
        }
        for(Thread thread : threads) thread.run();
        for(Thread thread : threads) thread.join();
        for(Soma thread : threads) media += thread.soma;
        System.out.println("Media com oito threads: " +  media/numeros.size());
    }
}

