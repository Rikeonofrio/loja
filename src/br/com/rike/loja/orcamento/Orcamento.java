package br.com.rike.loja.orcamento;

import br.com.rike.loja.orcamento.siuacao.SituacaoOrçamento;

import java.math.BigDecimal;
import java.util.PropertyResourceBundle;

public class Orcamento {
    private BigDecimal valor;
    private int quanitidadeItens;
    private SituacaoOrçamento situacao;

    public Orcamento(BigDecimal valor, int quanitidadeItens) {
        this.valor = valor;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);

        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }
    public void aprovar() {
        this.situacao.aprovar(this);
    }
    public void reprovar() {
        this.situacao.reprovar(this);
    }
    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuanitidadeItens() {

        return quanitidadeItens;
    }

    public void setSituacao(SituacaoOrçamento situacao) {
        this.situacao = situacao;
    }

    public SituacaoOrçamento getSituacao() {
        return situacao;
    }
}

