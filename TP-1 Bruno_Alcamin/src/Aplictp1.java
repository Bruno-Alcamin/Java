import java.util.Scanner;
public class Aplictp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);

		int opc=0;
		int p=-1;


		lista_um list1 = new lista_um(10);
		lista_dois list2 = new lista_dois(20);
		lista_tres list3 = new lista_tres(30);

		do{
			System.out.println("1- Preenche a lista lista_um");
			System.out.println("2- Preenche a lista lista_dois");
			System.out.println("3- Transfere todos os elementos para lista_tres");
			System.out.println("4- Exibe os elementos da lista lista_um");
			System.out.println("5- Exibe os elementos da lista lista_dois");
			System.out.println("6- Exibe os elementos da lista lista_tres");
			System.out.println("7- Ordena a lista lista_tres");
			System.out.println("9- Fim");
			System.out.println("Selecione: ");

			opc = entrada.nextInt();
			switch(opc){

			case 1:
				if(list1.listacheia()){
					System.out.println("A lista esta cheia.");
				}else{
					list1.insere();
					System.out.println("Valor inserido com sucesso.");
				}
				break;
			case 2:
				if(list2.listacheia()){
					System.out.println("Lista esta cheia");
				}else{
					list2.insere();
					System.out.println("Valor inserido com sucesso.");
				}
				break;
			case 3:
				if(list2.listavazia()){
					System.out.println("Lista dois esta vazia");
				}else{
					if(list1.listavazia()){
						System.out.println("A lista um esta vazia.");
					}else{
						if(list3.elementos[29]!=0){
							System.out.println("Lista já preenchida");
						}else{
							for(int i=0;i<=list1.getp();i++){
								p=p+1;
								list3.elementos[p]=list1.getvalor(i);

							}
							for(int i=0;i<=list2.getp();i++){
								p=p+1;
								list3.elementos[p]=list2.getvalor(i);

							}

						}
					}
				}
				break;
			case 4:
				if(list1.listavazia()){
					System.out.println("Lista esta vazia");
				}else{
					for(int i=0;i<=list1.getp();i++){
						System.out.println("Valor"+i+" : "+list1.getvalor(i)+" ");
					}
				}	
				break;
			case 5:
				if(list2.listavazia()){
					System.out.println("Lista esta vazia");
				}else{
					for(int i=0;i<=list2.getp();i++){
						System.out.println("Valor"+i+" : "+list2.getvalor(i)+" ");
					}
				}	
				break;
			case 6:
				if(list2.listavazia()){
					System.out.println("Lista dois esta vazia");
				}else{
					if(list1.listavazia()){
						System.out.println("A lista um esta vazia.");
					}else{
						for(int i=0;i<30;i++){
							System.out.println("Valor"+i+" : "+list3.elementos[i]+" ");					}
					}	
				}
				break;
			case 7:
				list3.organiza();				
				break;
			case 9:
				System.out.println("Fim");
				break;
			default:
				System.out.println("Opção Invalida");
				break;
			}

		}while(opc != 9);

		entrada.close();


	}

}
