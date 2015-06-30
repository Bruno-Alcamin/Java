import java.util.Scanner;


public class AplicaçãoContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);

		int opc=0,x=0;
		
		System.out.println("Quantas pessoas já estão no local ?");
		x = entrada.nextInt();
		
		Contador conta1 = new Contador(x);
		
		do{

			System.out.println("1- Incrementar");
			System.out.println("2- decrementar");
			System.out.println("3- Mostra Valor");
			System.out.println("4- fim");
			System.out.print("Selecione: ");
			opc= entrada.nextInt();
		
			switch(opc){
			case 1:
				conta1.incrementa();
				break;
			case 2:
				conta1.decrementa();
				break;
			case 3:
				System.out.println("Situação: "+conta1.valorcontador());
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
