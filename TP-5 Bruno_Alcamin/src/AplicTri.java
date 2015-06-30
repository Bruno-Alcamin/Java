import java.util.Scanner;


public class AplicTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o tamanho da pilha ?");
		
		int vlpilha = entrada.nextInt();
		
		pilha p1 = new pilha(vlpilha);
		
		Triangulo valor;
		int a,b,c,pos=0;
		
		int opc;
		
		do{
			
			System.out.println("1 - Entrada de Triangulo");
			System.out.println("2 - Retirada de Triangulo");
			System.out.println("3 - Mostra Triangulos");
			System.out.println("4 - Primeiro Triangulo");
			System.out.println("5 - Calcular Perimetro");
			System.out.println("6 - Calcular Área");
			System.out.println("9 - Fim");
			
			opc = entrada.nextInt();
			
			switch(opc){
				
				case 1:
					if(p1.pilhacheia()){
						System.out.println("A pilha de Triangulos esta cheia !");
					}else{
						System.out.print("Insira o Lado A: ");
						a = entrada.nextInt();
						System.out.print("Insira o Lado B: ");
						b = entrada.nextInt();
						System.out.print("Insira o Lado C: ");
						c = entrada.nextInt();
						valor = new Triangulo(a,b,c);
						if(valor.isTriangulo()==true){
							System.out.println("Valores informados não correspondem a de um triangulo");
						}else{
							p1.empilha(valor);
						}	
					}
					break;
				case 2:
					if(p1.pilhavazia()){
						System.out.println("Lista de Triangulos esta vazia !");
					}else{
						System.out.println("Removidos : "+"A: "+p1.valortopo().getA()+" B: "+p1.valortopo().getB()+" C: "+p1.valortopo().getC());
						valor = p1.desempilha();
					}
					break;
				case 3:
					if(p1.pilhavazia()){
						System.out.println("Lista de Triangulos esta vazia !");
					}else{
						for(int i = p1.gettopo(); i>-1;i--){
							System.out.println("A: "+p1.getpos(i).getA()+" B: "+p1.getpos(i).getB()+" C: "+p1.getpos(i).getC());
						}
					}
					break;
				case 4:
					if(p1.pilhavazia()){
						System.out.println("Lista de Triangulos esta vazia !");
					}else{
						System.out.println("Triango no topo: A: "+p1.valortopo().getA()+" B: "+p1.valortopo().getB()+" C: "+p1.valortopo().getC());
					}
					break;
				case 5:
						System.out.println("Qual posição deseja verificar ?");
						pos = entrada.nextInt();

					if(p1.pilhavazia()){
						System.out.println("Lista de Triangulos esta vazia !");
					}else{
						if(pos>p1.getqtid()){
							System.out.println("Opção Invalida !");
						}else{
							System.out.println("Perimetro do trigangulo da posição "+pos+" : "+p1.getpos(pos-1).Perimetro());
						}
					}
					
					break;
				case 6:				
						System.out.println("Qual posição deseja verificar ?");
						pos = entrada.nextInt();
					
					if(p1.pilhavazia()){
						System.out.println("Lista de Triangulos esta vazia !");
					}else{
						if(pos>p1.getqtid()){
							System.out.println("Opção Invalida !");
						}else{
							System.out.println("Área do trigangulo da posição "+pos+" : "+p1.getpos(pos-1).Area());
						}
					}
						
					
					break;
				default :
					System.out.println("Opção Invalida");
					break;
				case 9:
					break;
			}

		}while(opc !=9);

		entrada.close();
	}

}
