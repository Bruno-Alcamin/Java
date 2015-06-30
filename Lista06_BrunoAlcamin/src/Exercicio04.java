import java.util.Scanner;


public class Exercicio04 {
	
	public static void numeros_pares(int m, int n){

	while(m<=n){
		
		System.out.println(m);
		
		m+=2;		
	}	
}	
	

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		
		int prinumero,segunumero;
		
		
		System.out.println("Primeiro Número");
	
	
		prinumero = entrada.nextInt();
		
		System.out.println("Segundo Número");
		
		segunumero = entrada.nextInt();
		
		
		if (prinumero >= segunumero){
			
			System.out.println("Impossível realizar procedimento com numeros informados");
		}else{
			if(prinumero % 2 != 0){
				prinumero++;
			}
		}
		
		numeros_pares(prinumero,segunumero);
		
		entrada.close();
	}

}
