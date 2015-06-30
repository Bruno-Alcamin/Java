import java.util.Scanner;


public class Aplicplihaligada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner (System.in);
		Pilha p1 = new Pilha();
		int opc,valor;
		
		do{
			System.out.println("1- Empilha");
			System.out.println("2- desempilha");
			System.out.println("3- Elemento do topo");
			System.out.println("4- Mostra Pilha");
			System.out.println("5- Quantidade de Elementos");
			System.out.println("9- Sair");
			opc = entrada.nextInt();
			
			switch(opc){
			
			case 1:
				System.out.print("Digite o valor: ");
				valor = entrada.nextInt();
				p1.empilha(valor);
				break;
			case 2:
				if(p1.PilhaVazia()){
					System.out.println("A pilha esta vazia !");
				}else{
					System.out.println("Removido: "+p1.desempilha());
				}
				break;
			case 3:
				if(p1.PilhaVazia()){
					System.out.println("A pilha esta vazia !");
				}else{
					System.out.println("O elemento do topo é: "+p1.ElementoTopo());
				}
				break;
			case 4:
				if(p1.PilhaVazia()){
					System.out.println("A pilha esta vazia !");
				}else{
					Node aux = p1.GetTopo();
					while(aux!=null){
						System.out.println((aux.info));
						aux = aux.prox;
					}
				}
				break;
				
			case 5:
				if(p1.PilhaVazia()){
					System.out.println("A pilha esta vazia !");
				}else{
					System.out.println("A quantidade de elementos é :"+p1.GetQtde());
				}
				break;
			default:
				System.out.println("Opção Invalida !!!");
				break;
			case 9:
				System.out.println("Fim!!!");
				break;
			}
			
		}while(opc!=9);
		
		entrada.close();

	}

}
