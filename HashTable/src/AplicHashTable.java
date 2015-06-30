
import java.util.Scanner;
public class AplicHashTable {



	
	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int opc;
			System.out.println("Qual o tamanho da hash Table ?");
			int tam = entrada.nextInt();
			HashTable t1 = new HashTable(tam);
			
			
			do{
				System.out.println("1 - Insere");
				System.out.println("2 - remove");;
				System.out.println("3 - Busca");
				System.out.println("4 - mostra");
				System.out.println("5 - Fator de Espalhamento");
				System.out.println("9 - FIM ");
				System.out.println("seleciona:");
				
				
				opc = entrada.nextInt();
				
				switch(opc){
				case 1:
					System.out.println("Qual o numero a ser inserido ?");
					int x = entrada.nextInt();
					t1.insere(x);
					break;
				case 2:
					if(t1.ListaVazia()==true){
					}else{
					System.out.println("Qual número a remover ?");
					int x2 = entrada.nextInt();
					t1.Remove(x2);
					}
					break;	
				case 3:
					if(t1.ListaVazia()==true){
					}else{
					System.out.println("qual o numero a pesquisar");
					int x1 = entrada.nextInt();
					System.out.println(t1.Busca(x1));
					}
					break;	
				case 4:
					if(t1.ListaVazia()==true){
					}else{
					System.out.println("Lista Atual");
					t1.MostraLista();
					}
					break;
				case 5:
					for(int t=0;t<=1340;t++){
						t1.insere(t);
					}
					String text=null;
					if(t1.VerificaEspalhamento()==0){
						text="Excelente";
					}else{
						if(t1.VerificaEspalhamento()==1){
							text="Ótimo";
						}else{
							text="Bom";
						}
					}
					System.out.println("O Fator de espalhamento é: "+text);
					
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


