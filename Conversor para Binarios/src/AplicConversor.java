
// aplic de conversão de valores
import java.util.Scanner;

public class AplicConversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		Pilha p1 = new Pilha(10);
		
		int valor, auxvalor;
		
		System.out.println("Digite um número para conversão: ");
		
		valor = entrada.nextInt();
		
		auxvalor = valor;
		
		do{
			int resto = auxvalor % 2;
			
			p1.Empilha(resto);
			
			auxvalor = auxvalor/2;
			
		}while(auxvalor!=0);
		
		System.out.print("o numero "+valor+ " corresponde ao numero binário: ");
		for(int i = p1.GetTopo(); i > -1;i--){
			System.out.print(p1.Desempilha());
		}
		entrada.close();
	}

}
