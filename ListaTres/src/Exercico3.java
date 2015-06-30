import java.util.Scanner;

public class Exercico3 {

	public static void main(String[] args) {
		
		int c=1,n;
		
		Scanner entrada =new Scanner (System.in);
	
		System.out.println("Qual o limite da sequencia ?");
		
		n= entrada.nextInt();
		
		while (c<=n) {
			System.out.println(c);
			
			c++;
		}
		entrada.close();
	}

}
