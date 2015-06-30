import java.util.Scanner;


public class Ex2 {
	
	public static int s(int m, int n){
		
		if (n==m){
			return m;
		}else{
			return s(m,n-1)+n;
		}

	}
	
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o valor do primeiro numero ?");
		
		int x = entrada.nextInt();
		
		System.out.println("Qual o valor do segundo numero ?");
		
		int y = entrada.nextInt();
		
		System.out.println("Valor: "+s(x,y));
		
		entrada.close();
		
	}

}
