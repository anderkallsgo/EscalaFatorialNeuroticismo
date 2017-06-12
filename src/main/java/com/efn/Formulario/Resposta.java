package com.efn.Formulario;

public class Resposta {

    private final int numQuestao;
    private final Alternativa alternativa;

    public Resposta(int numQuestao, Alternativa alternativa) {

        this.numQuestao = numQuestao;
        this.alternativa = alternativa;
    }

    public Alternativa getAlternativa() {
        return alternativa;
    }
}
