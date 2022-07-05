package br.com.senai.turbo.poo;

public class Principal {
	
	public static void main(String[] args) {
		
		Mamifero m1 = new Mamifero(); //Mamifero() cria o objeto na memoria (é o construtor)
		m1.setNome("Max");
		System.out.println("Nome: " + m1.getNome());
		
		m1.setTipo("Cachorro");
		System.out.println("Tipo: " + m1.getTipo());
		
		m1.setIdade(10);
		System.out.println("Idade: " + m1.getIdade());
		
		m1.setRaca("Labrador");
		System.out.println("Raça: " + m1.getRaca());
		
		m1.setAltura(1.60);
		System.out.println("Altura: " + m1.getAltura());
		
		m1.setSexo("Masculino");
		System.out.println("Sexo: " + m1.getSexo());;
		
		m1.setPeso(20.0);
		System.out.println("Peso: " + m1.getPeso());
		
		m1.setTipoSanguineo("+AB");
		System.out.println("Tipo sanguíneo: " + m1.getTipoSanguineo());
		
		m1.setCor("Dourado");
		System.out.println("Cor: " + m1.getCor());
		
		Mamifero m2 = new Mamifero();
		m2.setNome("Sandra");
		System.out.println("Nome: " + m2.getNome());
		
		m2.setTipo(null);
		
		m2.setIdade(23);
		System.out.println("Idade: " + m2.getIdade());
		
	}

}
