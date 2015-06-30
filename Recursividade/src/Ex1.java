import java.util.Scanner;


public class Ex1 {
	
	public static int mdc(int x, int y){
		
		if (x==y){
			return x;
		}
		
		if (x<y){
			return mdc(y,x);
		}else{
			return mdc(x-y,y);
		}
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o valor de X ?");
		
		int x = entrada.nextInt();
		
		System.out.println("Qual o valor de Y ?");
		
		int y = entrada.nextInt();
		
		System.out.println("Valor: "+mdc(x,y));
		
		entrada.close();
		
		
		
	}

}
