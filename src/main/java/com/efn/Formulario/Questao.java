package com.efn.Formulario;

import java.util.List;

public class Questao {

    private String enunciado;
    private List<Alternativa> listaDeAlternativas;

    public Questao(String enunciado, List<Alternativa> listaDeAlternativas) {

        this.enunciado = enunciado;
        this.listaDeAlternativas = listaDeAlternativas;
    }

    public String getEnunciado() {
        return enunciado;
    }
}
