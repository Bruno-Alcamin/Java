package est;


import java.util.Scanner;

public class aplic {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int opc,valor;
		
		Pilha p = new Pilha(10);
		
		Fila f = new Fila(10);
		
		do{
			
			System.out.println("1-Insere na Fila");
			System.out.println("2-Remove na Fila");
			System.out.println("3-Transfere para Pilha");
			System.out.println("4-Mostra Fila");
			System.out.println("5-Mostra Pilha");
			System.out.println("6-Soma da Pilha");
			System.out.println("7-Soma da fila");
			System.out.println("8-Pesquisa número na fila");
			System.out.println("9-Sair");
			opc = entrada.nextInt();
			
			
			switch(opc){
			
			case 1:
				System.out.println("Digite um valor para ser inserido");
				valor = entrada.nextInt();
				f.insere(valor);
				break;
			case 2:
				System.out.println("Removido: "+f.Remove());
				break;
			case 3:
				for(int i=f.getInic();i<=f.getFim();i++){
					int aux = f.getpos(i);
					p.Empilha(aux);
					f.Remove();
				}
				System.out.println("Fila Transferiada para pilha");
				break;
			
			case 4:
				if(f.getInic()<f.getFim()){
					for(int i= f.getInic();i<=f.getFim();i++){
						System.out.print(f.getpos(i));
					}
				}else{
					for(int i= f.getInic();i<=f.getTam();i++){
						System.out.print(f.getpos(i));
					}
					
					for(int i= 0;i<=f.getFim();i++){
						System.out.print(f.getpos(i));
					}
				}
				System.out.println("");
				break;
				
			case 5:
				for(int i = p.getTopo();i>-1;i--){
					System.out.println(p.getPos(i));
				}
				break;
				
			case 6:
				System.out.println("A soma dos elementos da Pilha é: "+p.Soma());
				break;
				
			case 7:
				System.out.println("A soma dos elementos da Fila é: "+f.Soma());
				break;

			case 8:
				System.out.println("Qual o número deseja pesquisar na fila?");
				int pes = entrada.nextInt();
				boolean y=f.pes(pes);
				String frase;
				if(y==true){
					frase="existe";
				}else{
					frase="não existe";
				}
				System.out.println("O número: "+pes+", "+frase+" na fila.");
				break;
			}	
			
		}while(opc!=9);

		entrada.close();

	}

}
