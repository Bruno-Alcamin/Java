import java.util.Scanner;


public class Exercicio08 {
	
	public static int maiornumero(int a,int b,int c){
		
		if (a<b){
			a=b;
		}
		if(a<c){
			a=c;			
		}
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int z,a,b,c;
		
		System.out.println("Qual o primeiro numero?");
		
		a = entrada.nextInt();
		
		System.out.println("Qual o segundo numero?");
		
		b = entrada.nextInt();
		
		System.out.println("Qual o terceiro numero?");
		
		c = entrada.nextInt();
		
		z = maiornumero(a,b,c);
		
		System.out.println("O maior numero é: "+z);
		
		entrada.close();
		
	}

}
