package br.com.senai.poo;

public abstract class Pessoa {
	
	private String nome;
	
	// void
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}



	public abstract String verificarNome();

}
