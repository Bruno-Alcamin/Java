import java.util.Scanner;


public class Contador {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		int contador=0;

		int opc=0;

		do{

			System.out.println("1- Incrementar");
			System.out.println("2- decrementar");
			System.out.println("3- Mostra Valor");
			System.out.println("4- fim");
			System.out.print("Selecione: ");
			opc= entrada.nextInt();

			switch(opc){
			case 1:
				contador++;
				break;
			case 2:
				contador--;
				break;
			case 3:
				System.out.println("Situação"+contador);
				break;
			case 4:
				System.out.println("FIM");
				break;
			default:
				System.out.println("Opção Invalida");
				break;
			}	

		}while(opc!= 4);

		entrada.close();

	}

}
