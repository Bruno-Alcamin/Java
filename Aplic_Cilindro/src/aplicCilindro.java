import java.util.Scanner;


public class aplicCilindro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opc;

		Scanner entrada = new Scanner(System.in);
		fila f1 = new fila(10);
		Cilindro valor;
		float altura,raio;
		do{
			System.out.println("1 - Insere novo Cilindro");
			System.out.println("2 - Remove Cilindro");
			System.out.println("3 - Primeiro Cilindro");
			System.out.println("4 - Mostra fila de Cilindros");
			System.out.println("9 - FIM ");
			System.out.println("seleciona");
			
			
			opc = entrada.nextInt();
			
			switch(opc){
			case 1:
				if(f1.filacheia()){
					System.out.println("A fila esta cheia");
				}else{
					System.out.println("Insira Raio");
					raio=entrada.nextFloat();
					System.out.println("Insira Altura");
					altura=entrada.nextFloat();
					valor = new Cilindro(altura,raio);
					f1.insere(valor);
				}
			break;
			case 2:
				if(f1.filavazia()){
					System.out.println("Fila esta vazia");
				}else{
					valor=f1.remove();
					
					System.out.println("Removidos : "+"Altura: "+valor.getAltura()+" "+"Raio: "+valor.getRaio());
				}
				break;	
				
			case 3:
				if(f1.filavazia()){
					System.out.println("Fila esta vazia");
				}else{
					valor=f1.primeiro();
					System.out.println("Primeiro da fila "+"Altura: "+valor.getAltura()+" "+"Raio: "+valor.getRaio());
				}
				break;	
				
			case 4:
				if(f1.filavazia()){
					System.out.println("Fila esta vazia");
				}else{
					if(f1.getIncio()<=f1.getFim()){
						for(int i=f1.getIncio();i<=f1.getFim();i++){
							System.out.println("Altura:"+f1.getValor(i).getAltura()+"Raio"+f1.getValor(i).getRaio());
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
