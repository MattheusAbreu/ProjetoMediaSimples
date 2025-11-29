package executavel;

import javax.swing.JOptionPane;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		String nota1= JOptionPane.showInputDialog(null,"Digite a primeira nota: ");
		String nota2= JOptionPane.showInputDialog(null,"Digite a segunda nota: ");
		String nota3= JOptionPane.showInputDialog(null,"Digite a terceira nota: ");
		String nota4= JOptionPane.showInputDialog(null,"Digite a quarta nota: ");
		int dia = 2;
		
		
		System.out.println("Condicao IF: "+CondicaoIf.verificaMediaAluno(Integer.parseInt(nota1),Integer.parseInt(nota2),Integer.parseInt(nota3),Integer.parseInt(nota4)));
		System.out.println("Condicao IF Ternario: "+CondicaoIf.verificaMediaAlunoComOperadorTernario(Integer.parseInt(nota1),Integer.parseInt(nota2),Integer.parseInt(nota3),Integer.parseInt(nota4)));
		
		System.out.println("\nDia: "+SwitchCase.verificarDia(dia));
		
		int resposta = JOptionPane.showConfirmDialog(null, "Gostaria de ver sua nota? " );
		
		if (resposta == 0) {
			System.out.println("clicou em sim");
		}
		else if (resposta == 1) {
			System.out.println("Clicou em Nao");
		}
		else {
			System.out.println("Clicou em cancelar");
		}
	

		
		
		
		
		
		
		
	}

}
