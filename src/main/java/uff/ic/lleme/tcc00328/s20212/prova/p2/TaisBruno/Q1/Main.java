package uff.ic.lleme.tcc00328.s20212.prova.p2.TaisBruno.Q1;

public class Main {

    public static void main(String[] args) {
        //Palavras
        Palavra palavra_livro = new Palavra("livro", "livro");
        Palavra palavra_obra = new Palavra("obra", "obra");

        //Significados
        Sinonimos significado1 = new Substantivo("colecao de folhas de papel, impressas ou nao, reunidas em cadernos cujos dorsos sao unidos por meio de cola, costura etc., formando um volume que se recobre com capa resistente.");
        Sinonimos significado2 = new Substantivo("obra de cunho literario, artistico, cientifico etc. que constitui um volume [Para fins de documentacao, e uma publicacao nao periodica com mais de 48 paginas, alem da capa.].");
        Sinonimos significado3 = new Substantivo("aquilo que resulta de um trabalho, de uma acao.");

        //Dicionario
        Dicionario dicionario = new Dicionario();

        //Adicionando os significados nas palavras
        palavra_livro.significados.add(significado1);
        palavra_livro.significados.add(significado2);
        palavra_obra.significados.add(significado3);
        palavra_obra.significados.add(significado2);

        //Adicionando as palavras nos significados
        significado1.palavras.add(palavra_livro);
        significado2.palavras.add(palavra_livro);
        significado2.palavras.add(palavra_obra);
        significado3.palavras.add(palavra_obra);

        //Adicionando as palavras do dicionario
        dicionario.palavras.add(palavra_livro);
        dicionario.palavras.add(palavra_obra);

        //Imprimindo as palavras e o dicionario
        System.out.print(dicionario + "\n");
        
    }
}