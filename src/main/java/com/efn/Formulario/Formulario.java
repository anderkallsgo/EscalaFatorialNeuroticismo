package com.efn.Formulario;

import java.util.ArrayList;
import java.util.List;

public class Formulario{

    private String nome;
    private List<Questao> listaDeQuestoes = new ArrayList<Questao>();

    public Formulario(String nome) {
        this.nome = nome;
    }

    public void adicionar(Questao questao) {
        this.listaDeQuestoes.add(questao);
    }

    public String getNome() {
        return nome;
    }
}
