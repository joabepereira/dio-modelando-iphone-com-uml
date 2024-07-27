package br.com.iPhone.model;

public class GoogleMaps {
	
	private String local;
	
	public GoogleMaps() {
		this.local = "Brasil";
	}
	
	public String pesquisarLocal(String local) {
		this.local = local;
		System.out.println("Local encontrado: " + local);
		return local;
	}
	
	public void selecionarLocal() {
		System.out.println("Local selecionado!");
	}
	
	public void imagemSatelite() {
		System.out.println("Alternando para imagem de satélite!");
	}
}
