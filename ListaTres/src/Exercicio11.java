import java.util.Scanner;


public class Exercicio11 {

	public static void main(String[] args) {

		float penulnu,ultinu,soma,limite,contar=1;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual o limite da sequencia ?");
		
		limite = entrada.nextFloat();
		
		ultinu = 0;
				
		penulnu = 1;
		
		while (contar <= limite) {
				soma = ultinu+penulnu;
				System.out.println(soma);
				penulnu = ultinu;
				ultinu = soma;
				contar++;
		}
	
			entrada.close();

	}

}
