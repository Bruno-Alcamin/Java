import java.util.Scanner;


public class Exercicio09 {
	
	public static boolean verificarnumero (int a){
		
		boolean v=false;
		
		for (int i=0;i<=100;i++){
			
			if (i==a){
				v = true;
			}
		}
		
		return v;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int a;
		
		
		
		System.out.println("Qual o numero a verificar ?");
		
		a = entrada.nextInt();
		
		boolean x = verificarnumero(a);
		
		System.out.println("O numero esta dentro da sequencia?"+x);
		
		entrada.close();

	}

}
