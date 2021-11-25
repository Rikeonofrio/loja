package br.com.rike.loja.imposto;

import br.com.rike.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular (Orcamento orcamento);
}
