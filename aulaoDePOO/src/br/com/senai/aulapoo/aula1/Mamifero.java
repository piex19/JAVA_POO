package br.com.senai.aulapoo.aula1;

/*
 Uma classe � um conjunto de objetos/instru��es;
 
 O que � uma classe?
 - tem variavel/atributos (caracteristicas dos objetos);
 O que � um atributo?
 - caracteristica do objeto;
 
 */

    // classe
public class Mamifero {
	
	// atributo
	private String nomeCientifico;
	private String nomePopular;
	
	// construtor
	
	
	// metodo set get (a��es do objeto)                                                  operador de i     new - operador |  Mamifero() - construtor
	// this = diferenciar String local 
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
		
	}
	// modificador de acesso - tipo de retorno - nome do metodo	
	public String getNomeCientifico() {
		return this.nomeCientifico;
			
	
	
		// Modificador de acesso:
		// public - private - protected - package
		// 
	}
	public String getNomePopular() {
		return nomePopular;
	}
	public void setNomePopular(String nomePopular) {
		this.nomePopular = nomePopular;
	}
		
	}
