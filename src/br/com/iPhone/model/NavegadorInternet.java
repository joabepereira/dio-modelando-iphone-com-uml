package br.com.iPhone.model;

public class NavegadorInternet {
	
	private final String NOME;
	private int zoomNavegador;
	
	public NavegadorInternet(String nome) {
		this.NOME = nome;
		this.zoomNavegador = 100;
	}
	
	public void exibirPagina() {
		System.out.println("Exibindo página!");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada!");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando página!");
	}
	
	public void aumentarZoom() {
		this.zoomNavegador += 5; 
		System.out.println("Aumentando Zoom!");
	}
	
	public void diminuirZoom() {
		this.zoomNavegador -= 5; 
		System.out.println("Diminuindo Zoom!");
	}
	
	public String getNome() {
		return NOME;
	}
}
