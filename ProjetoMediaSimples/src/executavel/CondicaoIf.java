package executavel;

public class CondicaoIf {

	public static String verificaMediaAluno(int nota1, int nota2, int nota3, int nota4) {
		
		int media = (nota1 + nota2 + nota3 + nota4) / 4 ;
		
		if (media >= 70) {
			return "Média: "+media+" - APROVADO";
		}
		else if(media >=50 ) {
			return "Média: "+media+" - Recuperação";
		}
		else return "Média: "+media+" - Reprovado";
	}
	
	/*Operadores Ternarios, utilizado em pequenas verificacoes*/
	
	public static String verificaMediaAlunoComOperadorTernario(int nota1, int nota2, int nota3, int nota4) {
		int media = (nota1 + nota2 + nota3 + nota4) / 4 ;
		
		return media >= 70 ? "Aprovado" : "Reprovado";
		
		
		
		
		
		
	}

}
