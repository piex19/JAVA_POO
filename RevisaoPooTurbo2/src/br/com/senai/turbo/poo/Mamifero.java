package br.com.senai.turbo.poo;

public class Mamifero {
	private String nome;
	private int idade;
	private String raca;
	private double altura;
	private String sexo;
	private double peso;
	private String tipoSanguineo, cor, tipo;
	
	//classe,atributo,metodo,objeto
	    
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int novaIdade) {
		idade = novaIdade;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setRaca(String novaRaca) {
		raca = novaRaca;
	}
	public String getRaca() {
		return raca;
	}
	
	public void setAltura(double novaAltura) {
		altura = novaAltura;
	}
	public double getAltura() {
		return altura;
	}
	
	public void setSexo(String novoSexo) {
		sexo = novoSexo;
	}
	public String getSexo() {
		return sexo;
	}
	
	public void setPeso(double novoPeso) {
		peso = novoPeso;
	}
	public double getPeso() {
		return peso;
	}
	
	public void setTipoSanguineo(String novoTipoSanguineo) {
		tipoSanguineo = novoTipoSanguineo;
	}
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	
	public void setCor(String novaCor) {
		cor = novaCor;
	}
	public String getCor() {
		return cor;
	}
	
	public void setTipo(String novoTipo) {
		tipo = novoTipo;
	}
	public String getTipo() {
		return tipo;
	}
	

}
