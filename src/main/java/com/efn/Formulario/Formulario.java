package com.efn.Formulario;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Formulario extends EntidadeBase{

    @Column
    @JsonView(Formulario.class)
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
