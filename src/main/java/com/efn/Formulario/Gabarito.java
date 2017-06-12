package com.efn.Formulario;

import java.util.ArrayList;
import java.util.List;

public class Gabarito {

    private String nome;
    private List<Resposta> resposta = new ArrayList<Resposta>();

    public Gabarito(String nome) {
        this.nome = nome;
    }

    public void adicionar(Resposta resposta) {

        this.resposta.add(resposta);
    }

    public int calcularResultado() {
        int total = 0;
        for (Resposta resposta : resposta){
            total += resposta.getAlternativa().getValor();
        }
        return total;
    }
}
