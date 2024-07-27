package br.com.iPhone.teste;

import br.com.iPhone.model.AparelhoTelefone;
import br.com.iPhone.model.NavegadorInternet;

public class NavegadorInternetTeste {

	public static void main(String[] args) {

		AparelhoTelefone aparelhoTelefone = new AparelhoTelefone("Preto", 6.5f, "Processador Quad Core, 8Gb Ram");
		
		NavegadorInternet navegadorInternet = new NavegadorInternet("Firefox");

		aparelhoTelefone.selecionarApp(navegadorInternet);
		
		navegadorInternet.atualizarPagina();
		navegadorInternet.aumentarZoom();
		navegadorInternet.diminuirZoom();
		navegadorInternet.adicionarNovaAba();
		
		aparelhoTelefone.fecharApp();
	}

}
