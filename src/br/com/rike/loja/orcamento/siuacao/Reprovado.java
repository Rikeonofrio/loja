
package br.com.rike.loja.orcamento.siuacao;

import br.com.rike.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrçamento{

        public void fnalizar (Orcamento orcamento){
            orcamento.setSituacao(new Finalizado());
        }

    }


