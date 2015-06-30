import java.util.Scanner;


public class AplicFilaDupla {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opc;
		int valor;
		Scanner entrada = new Scanner(System.in);

		DuplaFila df = new DuplaFila(10);
		do{
			System.out.println("1 - Insere no Final");
			System.out.println("2 - remove no Incio");
			System.out.println("3 - primeiro");
			System.out.println("4 - mostra fila");
			System.out.println("5 - Insere no Inicio");
			System.out.println("6 - Remove no Final");
			System.out.println("7 - Ultimo");
			System.out.println("9 - FIM ");
			System.out.println("seleciona");
			
			
			opc = entrada.nextInt();
			
			switch(opc){
			case 1:
				if(df.filacheia()){
					System.out.println("A fila esta cheia");
				}else{
					System.out.println("Insira um valor");
					valor=entrada.nextInt();
					df.insere(valor);
				}
			break;
			case 2:
				if(df.filavazia()){
					System.out.println("Fila esta vazia");
				}else{
					System.out.println("Removido "+df.remove());
				}
				break;	
				
			case 3:
				if(df.filavazia()){
					System.out.println("Fila esta vazia");
				}else{
					System.out.println("Primeiro da fila "+df.primeiro());
				}
				break;	
				
			case 4:
				if(df.filavazia()){
					System.out.println("Fila esta vazia");
				}else{
					if(df.getIncio()<=df.getFim()){
						for(int i=df.getIncio();i<=df.getFim();i++){
							System.out.println(df.getValor(i));
						}
					}else{
						for(int i = df.getIncio();i<df.getTamanho();i++){
							System.out.println(df.getValor(i));
						}
						
						for(int i = 0;i<=df.getFim();i++){
							System.out.println(df.getValor(i));
						}

					}
				}
				break;	
				
			case 5:
				if(df.filacheia()){
					System.out.println("Fila Cheia !");
				}else{
					System.out.println("Valor a ser Inserido");
					valor = entrada.nextInt();
					df.InsereInic(valor);
				}
				break;
				
			case 6:
				if(df.filavazia()){
					System.out.println("Fila esta vazia");
				}else{
					System.out.println("Removido: "+df.RemoveFim());
				}
				break;
			case 7:
				if(df.filavazia()){
					System.out.println("Fila esta vazia");
				}else{
					System.out.println("O Último"+df.Ultimofila());
				}
				break;
			case 9:
				System.out.println("Fim");
				break;
				
			default:
					System.out.println("Opção Invalida");
			break;
			}
			
			
		}while(opc!=9);
		
		entrada.close();

	}


}
