import java.util.Scanner;


public class aplicpilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pilha p1 = new pilha(10);
		int opc;

		Scanner entrada = new Scanner(System.in);
		do{
			System.out.println("1 - Empilha");
			System.out.println("2 - Desempilha");
			System.out.println("3 - Elemento do Topo");
			System.out.println("4 - Mosta a Pilha");
			System.out.println("5 - Quantidade de elementos");
			System.out.println("9 - Fim");
			System.out.println("Selecione: ");
			opc = entrada.nextInt();
			switch(opc){
				case 1:
					if(p1.pilhacheia()){
						System.out.println("A pilha esta cheia");
					}else{
						System.out.println("Qual o valor a ser empilhado");
						int x = entrada.nextInt();
						p1.empilha(x);
					}
					break;
				case 2:
					if(p1.pilhavazia()){
						System.out.println("Lista esta vazia");
					}else{
						p1.desempilha();
					}
					break;
				case 3:
					if(p1.pilhavazia()){
						System.out.println("Lista esta vazia");
					}else{
						System.out.println(p1.getpos(p1.gettopo()));
					}
					break;
				case 4:
					if(p1.pilhavazia()){
						System.out.println("Lista esta vazia");
					}else{
						for(int i=0;i<=p1.gettopo();i++){
							System.out.println(p1.getpos(i));
						}
					}
					break;
				case 5:
					if(p1.pilhavazia()){
						System.out.println("Lista esta vazia");
					}else{
						System.out.println(p1.getqtid());
					}
					break;
				case 9:
					System.out.println("Fim");
				default:
					System.out.println("opcao invalida");
			}
		}while(opc != 9);



		entrada.close();

	}	
}
