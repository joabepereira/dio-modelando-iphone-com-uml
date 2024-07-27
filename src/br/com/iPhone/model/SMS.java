package br.com.iPhone.model;

public class SMS {
	
	private String mensagemRecebida;
	
	public void enviarMensagem() {
		System.out.println("Enviando mensagem!");
	}
	
	public void lerMensagem() {
		System.out.println("Mensagem: " + mensagemRecebida);
	}
}
