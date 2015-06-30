

import javax.swing.JOptionPane;



public class Meu_Primeiro_Programa {

	public static void main(String[] args) {
		
		String nome;

		nome = JOptionPane.showInputDialog(null, "Digite seu nome","Cadastro cliente",JOptionPane.QUESTION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Nome do Usúario: " +nome);

	}

}
