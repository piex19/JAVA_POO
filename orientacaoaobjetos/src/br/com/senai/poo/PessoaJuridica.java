package br.com.senai.poo;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	
	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PessoaJuridica(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public PessoaJuridica(String nome,String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}
	
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	@Override
	public String verificarNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
