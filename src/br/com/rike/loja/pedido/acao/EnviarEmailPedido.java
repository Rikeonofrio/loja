package br.com.rike.loja.pedido.acao;

import br.com.rike.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Enviando email com o pedido");
    }
}
