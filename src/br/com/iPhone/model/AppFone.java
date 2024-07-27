package br.com.iPhone.model;

import java.util.List;

public class AppFone {
	
	private List<Contato> contatos;
	private int volumeChamada;
	private boolean vivaVoz;
	private boolean chamadaEmEspera;
	
	public AppFone() {
		this.volumeChamada = 50;
		this.vivaVoz = false;
		this.chamadaEmEspera = false;
	}
	
	public List<Contato> getContatos() {
		return contatos;
	}
	
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public void atender() {
		System.out.println("Chamada atendida!");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz ativo!");
	}
	
	public void aumentarVolumeChamada() {
		this.volumeChamada += 1;
		System.out.println("Aumentando volume...");
	}
	
	public void diminuirVolumeChamada() {
		this.volumeChamada -= 1;
		System.out.println("Diminuindo volume...");
	}
	
	public void ativarVivaVoz() {
		this.vivaVoz = true;
		System.out.println("Viva voz ativo!");
	}
	
	public void desativarVivaVoz() {
		this.vivaVoz = false;
		System.out.println("Viva voz inativo!");
	}
	
	public void ativarChamadaEmEspera() {
		System.out.println("Ativando chamada em espera!");
	}
	
	public void desativarChamadaEmEspera() {
		System.out.println("Desativando chamada em espera!");
	}
}
