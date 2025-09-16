package Composite;

public class Arquivo implements ComponenteSistemaDeArquivos {
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirNome(String exibir) {
        System.out.println(exibir + "- Arquivo: " + this.nome);
    }
}
