import java.util.Scanner;


public class Exercico9 {

	public static void main(String[] args) {
		
		int m,x=1,y;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual o valor a somar ?");
		
		y =  entrada.nextInt();
		
		m=y;
		
		while (x<=100) {
			
			m= m+x;
			
			x++;
			
		}
		
		System.out.println("O valor da soma do número"+y+"mais os algoritmos de 1 a 100 é: "+m);
		
		entrada.close();
	}

}
