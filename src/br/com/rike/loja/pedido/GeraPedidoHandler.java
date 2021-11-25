package br.com.rike.loja.pedido;

import br.com.rike.loja.orcamento.Orcamento;
import br.com.rike.loja.pedido.acao.AcaoAposGerarPedido;
import br.com.rike.loja.pedido.acao.EnviarEmailPedido;
import br.com.rike.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
    //Contrutor com injeçao de dependencias: repository, service, etc.P
    private List<AcaoAposGerarPedido> acoes ;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute (GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrçamento(), dados.getQuantidadeDeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));

    }
}
