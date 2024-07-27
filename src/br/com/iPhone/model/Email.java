package br.com.iPhone.model;

import java.util.List;

public class Email {
	
	private List<Mensagem> listaMensagemEnviada;
	private List<Mensagem> listaMensagemInbox;
	
	public void lerEmail() {		
		for(Mensagem m : listaMensagemInbox) {
			System.out.println("Lendo mensagem da caixa de entrada!");
		}
	}
	
	public void enviarEmail() {		
		listaMensagemEnviada.add(new Mensagem());
		System.out.println("Enviando Email!");
	}
}
