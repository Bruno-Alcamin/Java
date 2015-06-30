import java.util.Scanner;


public class Exercicio01 {
	
	public static boolean isPar(int numero){
		
		boolean v;
		
		if (numero % 2 == 0 ){
			
			v=true;
		}else{
			v=false;
		}
		return v;		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int x;
	
	Scanner entrada = new Scanner (System.in);
	
	System.out.println("Qual o número a ser textado?");
	
	x= entrada.nextInt();

	System.out.println(isPar(x));
	
	if (isPar(x)){
		
		System.out.println("O número "+x+" é par");
	}else{
		System.out.println("O número "+x+" é impar");
	}
		
	entrada.close();	
	}
}
