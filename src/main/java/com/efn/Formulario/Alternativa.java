package com.efn.Formulario;

public class Alternativa {

    private final String descricao;
    private final int valor;

    public Alternativa(String descricao, int valor) {

        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getValor() {
        return valor;
    }
}
