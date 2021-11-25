
package br.com.rike.loja.orcamento.siuacao;

import br.com.rike.loja.DomainException;
import br.com.rike.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado  extends SituacaoOrçamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){

        return orcamento.getValor().multiply(new BigDecimal("0.05"));

    }

@Override
public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
}

    }


