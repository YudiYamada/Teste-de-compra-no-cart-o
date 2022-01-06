package com.algaworks.impresao.impresoras;

import com.algaworks.impressao.Impresora;
import com.algaworks.impressao.Imprimivel;

public class ImpresoraEpson implements Impresora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println();
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("==                   EPSON                   ==");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");

	}

}
