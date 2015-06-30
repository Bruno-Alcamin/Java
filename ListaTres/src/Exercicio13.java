import java.util.Scanner;


public class Exercicio13 {

	public static void main(String[] args) {
		
		int x=1,m,a;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual o valor inicial ?");
		
		a = entrada.nextInt();
		
		while (x<=20) {
			m=a*x;
			x++;
			System.out.println(m);
		}
		
		entrada.close();
		

	}

}
