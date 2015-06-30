import java.util.Scanner;


public class Exercicio6 {

	public static void main(String[] args) {
		
		int m,n,c=0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual o valor inicial ?");
		
		m = entrada.nextInt();
		
		System.out.println("Qual o limite ?");
		
		n = entrada.nextInt();
		
		if (m % 2 != 0){
			m++;
		}
		
		while (m<=n) {
			m+=2;
			c++;
		}
		
		System.out.println("A quantidade de numeros pares é"+c);
		
		entrada.close();
	}

}
