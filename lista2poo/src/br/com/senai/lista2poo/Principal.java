package br.com.senai.lista2poo;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main (String[] args) {
		
		/*
		 * String nome = JOptionPane.showInputDialog("Extensão: ");
		JOptionPane.showMessageDialog(null, nome.substring(7));
		
		
		if (!nome.toUpperCase().contains("BMP")) {
			
			JOptionPane.showMessageDialog(null, "imagem de qualidade para web");
			
		} 
		 */
		String i = "0";
		
		do {
		String alg = JOptionPane.showInputDialog("Escolha um algoritmo (3, 4 ou 9):");
		
		switch(alg) {
		case "3":
			Alg3Lista2 dados = new Alg3Lista2();
			dados.setExtensao(JOptionPane.showInputDialog(null, "Es"));
		
		
		
		
		
		}
			
			
			
			
		} while (i.equals("1"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
