package br.com.rike.loja.pedido;

import br.com.rike.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrçamento;
    private int quantidadeDeItens;

    public GeraPedido(String cliente, BigDecimal valorOrçamento, int quantidadeDeItens) {
        this.cliente = cliente;
        this.valorOrçamento = valorOrçamento;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrçamento() {
        return valorOrçamento;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }
}
