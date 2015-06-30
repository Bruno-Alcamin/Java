import java.util.Scanner;


public class Exercicio8 {

	public static void main(String[] args) {

		int m,a,x=2,b;
		
		Scanner entrada =new Scanner (System.in);
		
		System.out.println("Qual o valor da base ?");
		
		a = entrada.nextInt();
		
		System.out.println("Qual o valor do expoente ?");
		
		b = entrada.nextInt();
		
		m=a;
		
		while (x<=b) {
			
			m=m*a;
			
			x++;
			
		}
				
		System.out.println("O valor da pontenciação é: "+m);
		
		entrada.close();

	}

}
