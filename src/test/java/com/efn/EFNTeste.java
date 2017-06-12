package com.efn;

import com.efn.Formulario.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class EFNTeste {

    @Test
    public void deve_criar_um_formulario_com_cinco_questoes(){

        Formulario testeDePersonalidade =  new Formulario("Teste de Personalidade");
        Alternativa alternativaQ1a =  new Alternativa("Azul", 3);
        Alternativa alternativaQ1b =  new Alternativa("Amarelo", 5);
        Alternativa alternativaQ1c =  new Alternativa("Verde", 4);
        Alternativa alternativaQ1d =  new Alternativa("Vermelho", 8);
        Alternativa alternativaQ1e =  new Alternativa("Preto", 2);

        Alternativa alternativaQ2a = new Alternativa("Feliz", 3);
        Alternativa alternativaQ2b = new Alternativa("Raiva", 11);
        Alternativa alternativaQ2c = new Alternativa("Triste", 7);
        Alternativa alternativaQ2d = new Alternativa("Medo", 6);
        Alternativa alternativaQ2e = new Alternativa("Anciosa", 4);

        List<Alternativa> listaDeAlternativas = new ArrayList<Alternativa>();

        Questao questao1 = new Questao("Qual sua cor favorita? ", listaDeAlternativas);
        testeDePersonalidade.adicionar(questao1);

        Questao questao2 = new Questao("Como vc se sente agora? ", listaDeAlternativas);
        testeDePersonalidade.adicionar(questao2);

        System.out.println(testeDePersonalidade.getNome());
        System.out.println(questao1.getEnunciado());
        System.out.println("A: "+alternativaQ1a.getDescricao()+" B: "+alternativaQ1b.getDescricao()+" C: "+alternativaQ1c.getDescricao()+" D: "+alternativaQ1d.getDescricao()+" E: "+alternativaQ1e.getDescricao());

        System.out.println(questao2.getEnunciado());
        System.out.println("A: "+alternativaQ2a.getDescricao()+" B: "+alternativaQ2b.getDescricao()+" C: "+alternativaQ2c.getDescricao()+" D: "+alternativaQ2d.getDescricao()+" E: "+alternativaQ2e.getDescricao());

        Gabarito gabaritoTesteDePersonalidade = new Gabarito("Teste de Personalidade");
        Resposta resposta1 = new Resposta(1, alternativaQ1d);
        Resposta resposta2 = new Resposta(2, alternativaQ2b);

        gabaritoTesteDePersonalidade.adicionar(resposta1);
        gabaritoTesteDePersonalidade.adicionar(resposta2);

        System.out.println("Valor do Teste de Personalidade: "+gabaritoTesteDePersonalidade.calcularResultado());
    }
}
