package uff.ic.lleme.tcc00328.s20212.exercicio.tutorialOO.TaisBruno;
import java.io.File;
import java.util.Scanner;

public final class SistemaAcademico {
    static Aluno[] alunos = new Aluno[1];
    static Disciplina[] disciplinas = new Disciplina[1];
    static Inscricao[] inscricoes = new Inscricao[1];
    
    static void carregarAlunos(String nomeArquivo) {
        File myAlunos = new File(nomeArquivo);
   }
    static void carregarDisciplinas (String nomeArquivo) {
        File arquivo_disciplinas = new File(nomeArquivo);
    }
    
    static void carregarInscricoes (String nomeArquivo) {
        File arquivo_inscricoes = new File(nomeArquivo);
    }
    
    static void informarNotasDeAlunos (String nomeArquivo) {
        File arquivo_inscricoes = new File(nomeArquivo);
    }
        
    public static void main(String[] args) {
              carregarAlunos("arquivo.txt");
              carregarDisciplinas("arquivo.txt");
              Aluno aluno1 = new Aluno();
              Aluno aluno2 = new Aluno();
              Aluno aluno3 = new Aluno();
              Aluno aluno4 = new Aluno();
              Aluno aluno5 = new Aluno();
              
}
}
