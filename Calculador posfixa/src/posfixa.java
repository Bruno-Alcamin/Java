import java.util.Scanner;

public class posfixa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradachar = new Scanner(System.in);

		pilha p1 = new pilha(10);

		String expressao;
		char digito;
		int i=0;

		System.out.println("Digite a expressão: ");
		expressao= entradachar.nextLine();


		while( i < expressao.length()){

			digito = expressao.charAt(i);

			if(digito != '+' && digito != '-' && digito != '/' && digito != '*'){

				p1.empilha(digito);
			}else{
				if(digito =='+'){

					int x = Character.getNumericValue(p1.desempilha());

					int y =  Character.getNumericValue(p1.desempilha());

					int z= y+x;

					p1.empilha(z);
					
				}else{
					if(digito =='-'){

						int x = Character.getNumericValue(p1.desempilha());

						int y =  Character.getNumericValue(p1.desempilha());

						int z= y-x;

						p1.empilha(z);


					}else{
						if(digito =='*'){

							int x = Character.getNumericValue(p1.desempilha());

							int y =  Character.getNumericValue(p1.desempilha());

							int z= y*x;

							p1.empilha(z);

						}else{
							if(digito =='/'){

								int x = Character.getNumericValue(p1.desempilha());

								int y =  Character.getNumericValue(p1.desempilha());

								int z= y/x;

								p1.empilha(z);
							}
						}
					}
				}
			}

			i++;
		}

		System.out.println(p1.valortopo());

		entradachar.close();
	}

}
