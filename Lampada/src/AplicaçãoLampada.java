import java.util.Scanner;


public class Aplica��oLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);

		int opc=0;
		
		Lampada lamp1 = new Lampada ();
		
		do{

			System.out.println("1- Acender lampada");
			System.out.println("2- Apagar lampada");
			System.out.println("3- Mostra Situa��o");
			System.out.println("4- fim");
			System.out.print("Selecione: ");
			opc= entrada.nextInt();
		
			switch(opc){
			case 1:
				lamp1.acesa();
				break;
			case 2:
				lamp1.apagada();
				break;
			case 3:
				System.out.println("Situa��o: "+lamp1.situacao());
				break;
			case 4:
				System.out.println("FIM");
				break;
			default:
				System.out.println("Op��o Invalida");
				break;
			}	
			
			
		}while(opc!= 4);

		entrada.close();

	}

}
