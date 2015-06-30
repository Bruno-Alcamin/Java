import java.util.Scanner;


public class Ex3 {

	public static int s2(int m, int n){
		
		if (n==m){
			return m;
		}else{
			return  m+s2(m+1,n);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o valor de X ?");
		
		int x = entrada.nextInt();
		
		System.out.println("Qual o valor de Y ?");
		
		int y = entrada.nextInt();
		
		System.out.println("Valor: "+s2(x,y));
		
		entrada.close();
		
	}

}
