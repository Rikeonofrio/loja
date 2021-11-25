package br.com.rike.loja;

import br.com.rike.loja.imposto.CalculadoraDeImpostos;
import br.com.rike.loja.imposto.ICMS;
import br.com.rike.loja.orcamento.Orcamento;


import java.math.BigDecimal;

public class TesteImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);
        CalculadoraDeImpostos calculadoraDeImpostos= new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));
    }
}
