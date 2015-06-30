import java.util.Scanner;


public class aplicfila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opc;
		int valor;
		Scanner entrada = new Scanner(System.in);
		fila f1 = new fila(10);
		do{
			System.out.println("1 - Insere");
			System.out.println("2 - remove");
			System.out.println("3 - primeiro");
			System.out.println("4 - mostra fila");
			System.out.println("9 - FIM ");
			System.out.println("seleciona");
			
			
			opc = entrada.nextInt();
			
			switch(opc){
			case 1:
				if(f1.filacheia()){
					System.out.println("A fila esta cheia");
				}else{
					System.out.println("Insira um valor");
					valor=entrada.nextInt();
					f1.insere(valor);
				}
			break;
			case 2:
				if(f1.filavazia()){
					System.out.println("Fila esta vazia");
				}else{
					System.out.println("Removido "+f1.remove());
				}
				break;	
				
			case 3:
				if(f1.filavazia()){
					System.out.println("Fila esta vazia");
				}else{
					System.out.println("Primeiro da fila "+f1.primeiro());
				}
				break;	
				
			case 4:
				if(f1.filavazia()){
					System.out.println("Fila esta vazia");
				}else{
					if(f1.getIncio()<=f1.getFim()){
						for(int i=f1.getIncio();i<=f1.getFim();i++){
							System.out.println(f1.getValor(i));
						}
					}else{
						for(int i = f1.getIncio();i<f1.getTamanho();i++){
							System.out.println(f1.getValor(i));
						}
						
						for(int i = 0;i<=f1.getFim();i++){
							System.out.println(f1.getValor(i));
						}

					}
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
