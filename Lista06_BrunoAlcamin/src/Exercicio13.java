import java.util.Scanner;


public class Exercicio13 {
	
	public static boolean anobissexto(int ano){
		
		boolean v=false;
		
		float z=0,d=0,m4;
		
		while (ano>d){
			
			d=400*z;
			if (ano==d){
				v=true;
			}
			z++;			
		}
		
		m4 = ano % 4;
		
		if (m4==0){
			v=true;
		}
		
		return v;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int ano;
		
		boolean x;
		
		System.out.println("Qual ano a ser verificado?");
		
		ano = entrada.nextInt();
		
		x = anobissexto(ano);
		
		System.out.println("O ano é bissexto ?"+x);
		
		entrada.close();

	}

}
