package br.com.iPhone.teste;

import br.com.iPhone.model.AparelhoTelefone;
import br.com.iPhone.model.AppFone;

public class AppFoneTeste {

	public static void main(String[] args) {
		
		AparelhoTelefone aparelhoTelefone = new AparelhoTelefone("Preto", 6.5f, "Processador Quad Core, 8Gb Ram");
		
		AppFone appFone = new AppFone();
		
		aparelhoTelefone.selecionarApp(appFone);
		
		appFone.atender();
		appFone.ativarVivaVoz();
		appFone.desativarVivaVoz();
		
		aparelhoTelefone.fecharApp();

	}

}
