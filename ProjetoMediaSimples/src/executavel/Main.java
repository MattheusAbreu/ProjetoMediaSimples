package executavel;

import javax.swing.JOptionPane;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: "));
		
		double media = (nota1+nota2+nota3+nota4) / 4;
		
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "Média: "+media+" - APROVADO");
		}
		else if(media >= 5) {
			JOptionPane.showMessageDialog(null, "Média: "+media+" - RECUPERAÇÃO");
		
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Média: "+media+" - REPROVADO");
		}
		
		
		
		
	

		
		
		
		
		
		
		
	}

}
