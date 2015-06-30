import java.util.Scanner;


public class Exercicio15 {
	
	public static boolean numerosprimos(int a){
		
		int verif,x;
		
		x=a-1;
		
		boolean primo=true;
		
		for (int i = 2;i<=x;i++){
			
			verif = a%i;
			
			if (verif==0){
				primo=false;
			}
		}
		
		return primo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int a;
		
		boolean numeroprimo;
		
		System.out.println("Qual o numero a ser verificado?");
		
		a = entrada.nextInt();
		
		numeroprimo = numerosprimos(a);
		
		System.out.println("O numero "+a+" é primo ?"+numeroprimo);
		
		entrada.close();
		
		
	}

}
