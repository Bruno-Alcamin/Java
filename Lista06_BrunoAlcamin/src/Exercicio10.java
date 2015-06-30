import java.util.Scanner;


public class Exercicio10 {
	
	public static int media(int a,int b,int c){
		
		int media = (a+b+c)/3;
		
		return media;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int a,b,c,media;
		
		System.out.println("Primeiro numero");
		
		a = entrada.nextInt();
		
		System.out.println("Segundo numero");
		
		b = entrada.nextInt();
		
		System.out.println("Terceiro numero");
		
		c = entrada.nextInt();
		
		media = media(a,b,c);
		
		System.out.println("A media dos 3 numeors é: "+media);
		
		entrada.close();

	}

}
