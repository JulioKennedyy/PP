package Composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ComponenteSistemaDeArquivos {
    private String nome;
    private List<ComponenteSistemaDeArquivos> componentes = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(ComponenteSistemaDeArquivos componente) {
        this.componentes.add(componente);
    }

    public void remover(ComponenteSistemaDeArquivos componente) {
        this.componentes.remove(componente);
    }

    @Override
    public void exibirNome(String indentacao) {
        System.out.println(indentacao + "+ Pasta: " + this.nome);
        for (ComponenteSistemaDeArquivos componente : this.componentes) {
            componente.exibirNome(indentacao + "   ");
        }
    }
}
