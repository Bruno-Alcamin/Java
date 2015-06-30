import java.util.Scanner;


public class Exercicio07 {

	public static int maiornumero (int a,int b){

		if (a<b){
			a=b;
		}
		return a;
	}

	public static int menornumero (int a , int b){

		if (a>b){
			a=b;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);

		int a=0,b=0,opcao=0;

		do{


			System.out.println("1 - Escolher numeros");

			System.out.println("2 - Mostrar menor numero");

			System.out.println("3 - Mostrar maior numero");

			System.out.println("9 - FIM");

			opcao = entrada.nextInt();

			switch(opcao){

			case 1:
				System.out.println("Qual o pimeiro numero ?");

				a = entrada.nextInt();

				System.out.println("Qual o segundo numero ?");

				b = entrada.nextInt();

				break;

			case 2:


				int menor = menornumero(a,b);

				System.out.println("O menor numero é: "+menor);

				break;
			case 3:

				int maior = maiornumero(a,b);

				System.out.println("O maior numero é: "+maior);
				break;
			case 4:

				System.out.println("FIM");

				break;
			}

		}while(opcao ==9);
		entrada.close();
	}

}
