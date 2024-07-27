package br.com.iPhone.model;

public class Foto {
	
	private int zoomFoto;
	
	public Foto() {
		this.zoomFoto = 100;
	}
	
	public void selecionarAlbum() {
		System.out.println("Album selecionado!");
	}
	
	public void selecionarFoto() {
		System.out.println("Foto selecionada!");
	}
	
	public void aumentarZoomFoto() {
		this.zoomFoto += 5;
	}
	
	public void diminuirZoomFoto() {
		this.zoomFoto -= 5;
	}
}
