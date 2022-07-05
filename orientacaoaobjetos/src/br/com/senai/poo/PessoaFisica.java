package br.com.senai.poo;

public class PessoaFisica extends Pessoa {

	private String cpf;
	
	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PessoaFisica(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public PessoaFisica(String nome,String cpf) {
		super(nome);
		this.cpf = cpf;
	}
	
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public String verificarNome() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
