package br.com.iPhone.teste;

import br.com.iPhone.model.AparelhoTelefone;
import br.com.iPhone.model.ReprodutorMusica;

public class ReprodutorMusicaTeste {
	
	public static void main(String[] args) {
		
		AparelhoTelefone aparelhoTelefone = new AparelhoTelefone("Preto", 6.5f, "Processador Quad Core, 8Gb Ram");
		
		ReprodutorMusica reprodutorMusica = new ReprodutorMusica("Music Audio", "1.0.0");
		
		aparelhoTelefone.selecionarApp(reprodutorMusica);
		
		reprodutorMusica.selecionarMusica();
		reprodutorMusica.tocar();
		reprodutorMusica.pausar();
		reprodutorMusica.criarListaMusica();
		
		aparelhoTelefone.fecharApp();
	}

}
