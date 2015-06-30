import java.util.Scanner;


public class Exercicio06 {
	
	public static boolean AprovadoouReprovado(int nota){
		
		boolean verificar;
		
		if (nota< 6){
			
			verificar = false;
			System.out.println("Aluno Reprovado");
		}else{
			verificar = true;
			System.out.println("Aluno Aprovado");
		}
		
		
		return verificar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int nota;
		
		System.out.println("Qual é sua nota?");
		
		nota =entrada.nextInt();
		
		AprovadoouReprovado(nota);
		
		entrada.close();
		
	}

}
