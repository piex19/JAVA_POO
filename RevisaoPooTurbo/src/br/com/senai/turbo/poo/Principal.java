package br.com.senai.turbo.poo;

public class Principal {
	
	public static void main(String[] args) {
		
		Mamifero m1 = new Mamifero(); //Mamifero() cria o objeto na memoria (é o construtor)
		m1.setNome("Max");
		System.out.println(m1.getNome());
		
		m1.setIdade(10);
		System.out.println(m1.getIdade());
		
		m1.setRaca("Labrador");
		System.out.println(m1.getRaca());
		
	}

}
