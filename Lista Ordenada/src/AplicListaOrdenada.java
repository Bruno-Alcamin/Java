import java.util.Scanner;

public class AplicListaOrdenada {
public static void main(String[] args) {
		
		int opc;
		ListaOrdenada t1 = new ListaOrdenada();
		Scanner entrada = new Scanner(System.in);
		
		do{
			System.out.println("1 - Insere");
			System.out.println("2 - remove");;
			System.out.println("3 - Busca");
			System.out.println("4 - mostra");
			System.out.println("9 - FIM ");
			System.out.println("seleciona");
			
			
			opc = entrada.nextInt();
			
			switch(opc){
			case 1:
				System.out.println("Qual o numero a ser inserido ?");
				int x = entrada.nextInt();
				t1.insere(x);
				break;
			case 2:
				System.out.println("Qual número a remover ?");
				int x2 = entrada.nextInt();
				t1.Remove(x2);
				break;	
			case 3:
				System.out.println("qual o numero a pesquisar");
				int x1 = entrada.nextInt();
				System.out.println(t1.Busca(x1));
				break;	
			case 4:
				System.out.println("Lista Atual");
				t1.MostraLista();
				break;	
			case 9:
				System.out.println("FIM !!!");
				break;
				
			default:
					System.out.println("Opção Invalida");
			break;
			}
			
			
		}while(opc!=9);
		
		entrada.close();

	}

}
