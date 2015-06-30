import java.util.Scanner;


public class Fatorial {
	
	public static double fatorial(int n){
		
		if(n==0){
			return 1;//base da recursão;
		}else{
			return n*fatorial(n-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o numero a se verificar ?");
		
		int x = entrada.nextInt();
			
		System.out.println(fatorial(x));
		
		entrada.close();

	}

}
