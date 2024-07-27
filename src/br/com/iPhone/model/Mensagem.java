package br.com.iPhone.model;

import java.util.List;

public class Mensagem {
	
	private List<Contato> destinatario;
	private String assunto;
	private String texto;
	
	public void escreverMensagem(Contato contato, String assunto, String texto) {
		destinatario.add(contato);
		this.assunto = assunto;
		this.texto = texto;
	}
}
