import java.util.Scanner;


public class Exercicio11 {
	
	public static int expoente(int a,int b){
		
		int m =a;
		
		for (int i = 2; i<=b;i++){
			
			m=m*a;
		}
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int a,b,v;
		
		System.out.println("Qual valor da base ?");
		
		a = entrada.nextInt();
		
		System.out.println("Qual o valor do expoente?");
		
		b= entrada.nextInt();
		
		v = expoente(a,b);
		
		System.out.println("O valor da potenciação é: "+v);
		
		entrada.close();

	}

}
