package br.com.rike.loja.orcamento.siuacao;

import br.com.rike.loja.DomainException;
import br.com.rike.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrçamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser aprovado");
    }
    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser reprovado");
    }
    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser Finalizado");
    }

}
