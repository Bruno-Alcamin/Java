import java.util.Scanner;


public class AplicFilaLigada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Fila f1 = new Fila();
		int opc, valor;

		do{
			System.out.println("1 - Insere.");
			System.out.println("2 - Remove.");
			System.out.println("3 - Mostra Fila.");
			System.out.println("4 - Primeiro Elemento.");
			System.out.println("5 - Ultimo Elemento.");
			System.out.println("6 - Quantidade de Elementos.");
			System.out.println("7 - Remove tudo");
			System.out.println("9 - Fim !");
			opc = entrada.nextInt();


			switch(opc){

			case 1:
				System.out.print("Digite um valor: ");
				valor = entrada.nextInt();
				f1.Insere(valor);
				break;
			case 2:
				if (f1.FilaVazia()){
					System.out.println("A Fila Esta Vazia !");
				}else{
					System.out.println("Removido: "+f1.Remove());
				}
				break;
			case 3:
				if (f1.FilaVazia()){
					System.out.println("A Fila Esta Vazia !");
				}else{
					Node aux = f1.GetInic();
					while(aux != null){
						System.out.println(aux.info+" ");
						aux = aux.prox;
					}
				}
				break;
			case 4:
				if (f1.FilaVazia()){
					System.out.println("A Fila Esta Vazia !");
				}else{
					System.out.println("O primeiro elemento é: "+f1.Primeiro());
				}
				break;
			case 5:
				if (f1.FilaVazia()){
					System.out.println("A Fila Esta Vazia !");
				}else{
					System.out.println("O ultimo elemento é: "+f1.Ultimo());
				}
				break;
			case 6:
				if (f1.FilaVazia()){
					System.out.println("A Fila Esta Vazia !");
				}else{
					System.out.println("A quantidade de Elementos é: "+f1.GetQtde());
				}
				break;
			case 7:
				if (f1.FilaVazia()){
					System.out.println("A Fila Esta Vazia !");
				}else{
				f1.RemoveTudo();
				System.out.println("Removido Todos elementos!");
				}
				break;
			default:
				System.out.println("Opção Invalida !");
				break;
			case 9:
				System.out.println("Fim !!!");
				break;
			}

		}while(opc!=9);

		entrada.close();
	}

}
