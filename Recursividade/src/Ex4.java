import java.util.Scanner;


public class Ex4 {

	public static double dig(int n){
		if(n<=9){
			return 1;
		}else{
			return 1+dig(n/10);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o valor de digito ?");
		
		int n = entrada.nextInt();
	
		
		System.out.println("Valor: "+dig(n));
		
		entrada.close();
		
		

	}

}
