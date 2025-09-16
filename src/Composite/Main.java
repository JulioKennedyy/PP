package Composite;

public class Main {
    public static void main(String[] args) {
        Pasta pastaRaiz = new Pasta("Meu Drive");

        pastaRaiz.adicionar(new Arquivo("foto_ferias.jpg"));
        pastaRaiz.adicionar(new Arquivo("documento_importante.pdf"));

        Pasta pastaTrabalho = new Pasta("Trabalho");
        pastaTrabalho.adicionar(new Arquivo("relatorio_mensal.docx"));
        pastaTrabalho.adicionar(new Arquivo("apresentacao.pptx"));

        pastaRaiz.adicionar(pastaTrabalho);


        System.out.println("Exibindo a estrutura completa do sistema de arquivos:");
        pastaRaiz.exibirNome("");
    }
}
