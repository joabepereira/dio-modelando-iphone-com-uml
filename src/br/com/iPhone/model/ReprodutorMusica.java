package br.com.iPhone.model;

public class ReprodutorMusica {
	
	private final String NOME;
	private String versao;
	private boolean musicaTocando; 
	
	public ReprodutorMusica(String nome, String versao) {
		this.NOME = nome;
		this.versao = versao;
		this.musicaTocando = false;
	}
	
	public void tocar() {
		this.musicaTocando = true;
		System.out.println("Tocando musica!");
	}
	
	public void pausar() {
		this.musicaTocando = false;
		System.out.println("Música em pause!");
	}
	
	public void selecionarMusica() {
		System.out.println("Musica selecionada!");
	}
	
	public void criarListaMusica() {
		System.out.println("Lista de musica criada!");
	}
	
	public String getNome() {
		return NOME;
	}
}
