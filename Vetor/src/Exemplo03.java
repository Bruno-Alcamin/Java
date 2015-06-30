import java.util.Scanner;


public class Exemplo03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String nome[] = new String [10];

		
		for (int i=0;i<10;i++){
			
			System.out.println("Qual o nome ?");
			
			nome[i] = entrada.nextLine();
			
			
		}
		
		for (int i=0;i<10;i++){
		
		System.out.println(nome[i]);
		
		}
		entrada.close();
		
	}

}
