package br.com.iPhone.model;

public class AparelhoTelefone {
	
	private final String COR;
	private final float TAMANHO;
	private final String CONFIGURACAO;
	
	private ReprodutorMusica reprodutorMusica;
	private NavegadorInternet navegadorInternet;
	private AppFone appFone;
	private SMS sms;
	private Foto foto;
		
	public AparelhoTelefone(String cor, float tamanho, String configuracao) {
		this.COR = cor;
		this.TAMANHO = tamanho;
		this.CONFIGURACAO = configuracao;
		
		reprodutorMusica = new ReprodutorMusica("Music Audio", "1.0.0");
		navegadorInternet = new NavegadorInternet("Firefox");
		appFone = new AppFone();
		sms = new SMS();
		foto = new Foto();
	}

	public void selecionarApp(Object nomeApp) {
		if(nomeApp instanceof ReprodutorMusica)
			System.out.println("App " + ((ReprodutorMusica) nomeApp).getNome() + " selecionado!");
		else if(nomeApp instanceof AppFone)
			System.out.println("App Fone selecionado!");
		else
			System.out.println("App " + ((NavegadorInternet) nomeApp).getNome() + " selecionado!");
	}
	
	public void fecharApp() {
		System.out.println("Fechando APP!");	
	}
}
