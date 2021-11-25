package br.com.rike.loja.imposto;

import br.com.rike.loja.descontos.DeescontoParaValorMaiorQueQuinhentos;
import br.com.rike.loja.descontos.Desconto;
import br.com.rike.loja.descontos.DescontoParaMaisDeCincoItens;
import br.com.rike.loja.descontos.SemDesconto;
import br.com.rike.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaMaisDeCincoItens(
        new DeescontoParaValorMaiorQueQuinhentos(
                new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
