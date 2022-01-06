package com.algaworks.teste;

import com.algaworks.caixa.Checkout;
import com.algaworks.caixa.Compra;
import com.algaworks.impresao.impresoras.ImpresoraEpson;
import com.algaworks.impressao.Impresora;
import com.algaworks.pagamento.Cartao;
import com.algaworks.pagamento.Operadora;
import com.algaworks.pagamento.operadoras.Cielo;

public class TesteCheckout {

	public static void main(String[] args) {
		Operadora operadora = new Cielo();
		Impresora impresora = new ImpresoraEpson();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Yudi Yamada");
		cartao.setNumeroCartao("123");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Augusto Farias");
		compra.setProduto("RTX 3090 TI");
		compra.setValorTotal(20000);
		
		Checkout checkout = new Checkout(operadora, impresora);
		checkout.fecharCompra(compra, cartao);
	}
}
