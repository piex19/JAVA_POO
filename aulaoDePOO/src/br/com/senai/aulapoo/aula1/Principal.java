package br.com.senai.aulapoo.aula1;
import javax.swing.JOptionPane;

public class Principal {

	// ela que executa
	public static void main(String[] args) {
		
		Mamifero m1 = new Mamifero();
		
		m1.setNomeCientifico(JOptionPane.showInputDialog("Digite o nome cientifico: "));
		JOptionPane.showMessageDialog(null, "Nome cientifico: " + m1.getNomeCientifico());
		
		
		
	}
}
