import java.util.Scanner;


public class AplicSBST {
	
	public static void main(String[] args) {
		
		int opc;
		BST t1 = new BST();
		Scanner entrada = new Scanner(System.in);
		
		do{
			System.out.println("1 - Insere");
			System.out.println("2 - remove");
			System.out.println("3 - preOrdem");
			System.out.println("4 - posOrdem");
			System.out.println("5 - emOrdem");
			System.out.println("6 - Busca");
			System.out.println("7 - max");
			System.out.println("8 - min");
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
				System.out.println("Qual numero remover?");
				int y = entrada.nextInt();
				t1.MostraRemove(y);
				break;	
			case 3:
				System.out.println("Pré Ordem");
				t1.MostraPreOrdem();
				break;	
			case 4:
				System.out.println("Pos Ordem");
				t1.MostraposOrdem();
				break;	
			case 5:
				System.out.println("Em Ordem");
				t1.MostraemOrdem();
				break;
			case 6:
				System.out.println("Qual o número a pesquisar?");
				int x1 = entrada.nextInt();
				System.out.println(t1.MostraBusca(x1));
				break;
			case 7:
				System.out.print("Valor máximo da árvore: ");
				t1.Mostramax();
				break;
			case 8:
				System.out.print("Valor minimo da árvore: ");
				t1.Mostramin();
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
