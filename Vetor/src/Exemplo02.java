import java.util.Scanner;


public class Exemplo02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		int numero [] = new int[10];
		
		int valor;
				
		for (int i=0;i<10;i++){
		
		System.out.println("Digite o valor");
		
		valor = entrada.nextInt();
		
		numero[i]=valor;
		
		}
		
		for (int i=0;i<10;i++){
		
		System.out.println("V["+i+"]="+numero[i]);
		
		}
		
		System.out.println("tamanho do vetor"+numero.length);
		
		entrada.close();
	}

}
