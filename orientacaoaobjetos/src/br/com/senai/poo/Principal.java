package br.com.senai.poo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setNome("Bruno Ribeiro");
		pf1.setCpf("736-348-372-90");
		
		System.out.println("Cliente: " + pf1.getNome());
		System.out.println("CPF: " + pf1.getCpf());
		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setNome("Amanda Barros");
		pj1.setCnpj("96.405.429/0001-38");
		
		System.out.println("Cliente: " + pj1.getNome());
		System.out.println("CNPJ: " + pj1.getCnpj());
		
		
		
		
		
	}

}
