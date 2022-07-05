package br.com.senai.lista1poo;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		String i = "0";
		
		do {
		String alg = JOptionPane.showInputDialog("Escolha um algoritmo (8, 9 ou 22): ");
		
		switch(alg) {
		case "8":
			Alg8Lista1 dados = new Alg8Lista1();
			dados.setNome(JOptionPane.showInputDialog("Escreva seu nome: "));
			dados.setEndereco(JOptionPane.showInputDialog("Escreva seu endereço: "));
			dados.setTelefone(JOptionPane.showInputDialog("Escreva seu telefone: \nformato: (XX)XXXXX-XXXX"));
			
			JOptionPane.showMessageDialog(null, "Nome: " + dados.getNome() + "\nEndereço: " + dados.getEndereco() + "\nTelefone: " + dados.getTelefone());
		    break;
		
		case "9":
			Alg9Lista1 soma = new Alg9Lista1();
			soma.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Escreva um número: ")));
			soma.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Escreva outro número: ")));
			
			JOptionPane.showMessageDialog(null, "Soma: " + (soma.getNumero1() + soma.getNumero2()));
			break;
			
		case "22":
			Alg22Lista1 area = new Alg22Lista1();
			area.setDiagonal1(Integer.parseInt(JOptionPane.showInputDialog("Escreva a diagonal 1 do losango: ")));
			area.setDiagonal2(Integer.parseInt(JOptionPane.showInputDialog("Escreva a diagonal 2 do losango: ")));
			
			JOptionPane.showMessageDialog(null, "Área do losango: " + (area.getDiagonal1() * area.getDiagonal2() ) / 2);
			break;
			
			
			
		default :
			JOptionPane.showMessageDialog(null, "Informação errada.");
			
			
		}
		
		i = JOptionPane.showInputDialog(null, "Digite:\n0 - para parar.\n1 - para continuar.");
		
		}
		while (i.equals("1"));
			
		
		
		
	}

}
