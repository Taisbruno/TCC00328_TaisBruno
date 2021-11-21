package uff.ic.lleme.tcc00328.s20212.exercicios.tutorialOO.TaisBruno;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public final class SistemaAcademico {
        public Integer[] add(Integer[] srcArray, int elementToAdd) {
        Integer[] destArray = new Integer[srcArray.length+1];
        for(int i = 0; i < srcArray.length; i++) {
        destArray[i] = srcArray[i];
    }

    destArray[destArray.length - 1] = elementToAdd;
    return destArray;
}
          static void carregarAlunos(String nomeArquivo) {
            File myObj = new File("arquivo.txt");

   }
          public static void main(String[] args) {
              carregarAlunos("arquivo.txt");
              Aluno aluno1 = new Aluno();
              Aluno aluno2 = new Aluno();
              Aluno aluno3 = new Aluno();
              Aluno aluno4 = new Aluno();
              Aluno aluno5 = new Aluno();
              
}
}
