import java.util.Scanner;


public class Exercicio03 {
	
	
	public static void contarentrenumeros(int n1, int n2){
		
		
		for(int x=n1;x<=n2;x++){
			
			System.out.println(x);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m,n;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual o número inicial ?");
		
		m = entrada.nextInt();
		
		System.out.println("Qual o limite da sequência?");
		
		n = entrada.nextInt();
		
		contarentrenumeros(m,n);
		
		entrada.close();
		
	}

}	
