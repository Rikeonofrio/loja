package br.com.rike.loja.descontos;

import br.com.rike.loja.descontos.Desconto;
import br.com.rike.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DeescontoParaValorMaiorQueQuinhentos extends Desconto {
    public DeescontoParaValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.5"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
