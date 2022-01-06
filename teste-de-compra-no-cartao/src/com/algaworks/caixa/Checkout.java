package com.algaworks.caixa;

import com.algaworks.impressao.Impresora;
import com.algaworks.pagamento.Cartao;
import com.algaworks.pagamento.Operadora;

public class Checkout {

	private Operadora operadora;
	private Impresora impresora;
	
	public Checkout(Operadora operadora, Impresora impressora) {
		this.operadora = operadora;
		this.impresora = impressora;
	}
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if (autorizado) {
			this.impresora.imprimir(compra);
		} else {
			System.out.println("Pagamento foi negado!");
		}
	}
	
}