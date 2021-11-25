package br.com.rike.loja;

import br.com.rike.loja.orcamento.Orcamento;
import br.com.rike.loja.pedido.GeraPedido;
import br.com.rike.loja.pedido.GeraPedidoHandler;
import br.com.rike.loja.pedido.Pedido;
import br.com.rike.loja.pedido.acao.EnviarEmailPedido;
import br.com.rike.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = "Rodrigo";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(),
                  new EnviarEmailPedido()
                ));//dependencias
        handler.execute(gerador);
    }
}