import java.util.Scanner;

/* insere, pre ordem, pos ordem, em ordem, max, min, busca, remove*/

public class TestaBst {

	public static void main(String[] args) {
		BST t1 = new BST();
		Scanner entrada = new Scanner(System.in);
		int opc;
		int valor;
		
		do{
			System.out.println("1 - Insere");
			System.out.println("2 - Pré Ordem");
			System.out.println("3 - Pós Ordem");
			System.out.println("4 - Em Ordem");
			System.out.println("5 - Max");
			System.out.println("6 - Min");
			System.out.println("7 - Busca");
			System.out.println("8 - Remover");
			System.out.println("9 - Fim");
			System.out.println("Selecione");
			opc = entrada.nextInt();
			switch(opc){
			case 1:
				System.out.print("Inserir: ");
				valor = entrada.nextInt();
				t1.insere(valor);
				break;
			case 2:
				if(t1.bstVazia()){
					System.out.println("Árvore vazia!");
				}else{
					System.out.println("Pré Ordem:");
					t1.mostraPreOrdem();
				}
				break;
			case 3:
				if(t1.bstVazia()){
					System.out.println("Árvore vazia!");
				}else{
					System.out.println("Pós Ordem:");
					t1.mostraPosOrdem();
				}
				break;
			case 4:
				if(t1.bstVazia()){
					System.out.println("Árvore vazia!");
				}else{
					System.out.println("Em Ordem:");
					t1.mostraEmOrdem();
				}
				break;
			case 5:
				if(t1.bstVazia()){
					System.out.println("Árvore vazia!");
				}else{
					System.out.println("Max:");
					t1.mostraMax();
				}
				break;
			case 6:
				if(t1.bstVazia()){
					System.out.println("Árvore vazia!");
				}else{
					System.out.println("Min:");
					t1.mostraMin();
				}
				break;
			case 7:
				if(t1.bstVazia()){
					System.out.println("Árvore vazia!");
				}else{
					System.out.print("Buscar:");
					valor = entrada.nextInt();
					if(t1.busca(valor)){
						System.out.println("Valor encontrado.");
					}else{
						System.out.println("NÃO CONTÉM O NÚMERO "+valor+" NA ÁRVORE.");
					}
				}
				break;
			case 8:
				if(t1.bstVazia()){
					System.out.println("Árvore vazia!");
				}else{
					System.out.println("remover: ");
					valor = entrada.nextInt();
					t1.remove(valor);
				}
				break;
			case 9:
				System.out.println("Fim...");
				break;
			default:
				System.out.println("Opção Inválida.");
			}
		}while(opc != 9);
		entrada.close();
	
	}

}
