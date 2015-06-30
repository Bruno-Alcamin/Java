import java.util.Scanner;


public class Ex5 {
	
	public static double pot(int x, int n){
		if(n==0){
			return 1;
		}
		
		if(n<0){
			return 1/pot(x,Math.abs(n));
		}else{
			return x*pot(x,n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o valor de X ?");
		
		int x = entrada.nextInt();
		
		System.out.println("Qual o valor de Y ?");
		
		int y = entrada.nextInt();
		
		System.out.println("Valor: "+pot(x,y));
		
		entrada.close();
		
	}

}
