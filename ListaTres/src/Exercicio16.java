import java.util.Scanner;


public class Exercicio16 {

	public static void main(String[] args) {

		int x=3,z=0,y=1,n;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual o limite da sequência ?");
		
		n = entrada.nextInt();
		
		while (y<=n) {
			System.out.println(x);
			
			z=z+x;
			
			x=x*3;
			
			y++;			
		}
		
		System.out.println("A soma dos termos é: "+z);
		
		entrada.close();
	}

}
