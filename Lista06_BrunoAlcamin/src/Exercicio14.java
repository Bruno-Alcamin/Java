import java.util.Scanner;


public class Exercicio14 {
	
	public static int fatorial(int a){
		
		int x,m;
		
		x=a;
		
		m=a;
		
		while (x>1){
			
			x--;
			
			m=m*x;
		}
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int a,x;
		
		System.out.println("Qual o numero a ser verificado?");
		
		a = entrada.nextInt();
		
		x = fatorial(a);
		
		System.out.println("O fatorial de "+a+" é: "+x);
		
		entrada.close();

	}

}
