import java.util.Scanner;


public class Aplicexpre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradachar,entradaint;
		entradachar = new Scanner(System.in);
		entradaint = new Scanner(System.in);
		String expressao;
		int i=0;
		char simbolo;
		boolean valido=true;
		pilha p1 = new pilha(50);
		
		System.out.println("Digite a expressão: ");
		expressao= entradachar.nextLine();
		
		
		
		while( i < expressao.length()){
			
			simbolo = expressao.charAt(i);
			
			if ((simbolo == '{') ||(simbolo== '(')||(simbolo == '[')){
				p1.empilha(simbolo);
			}else{
				if((simbolo == '}') ||(simbolo== ')')||(simbolo == ']')){
					if(p1.pilhavazia()){
						valido=false;
					}else{
						if(( simbolo == '}')&&(p1.valortopo() == '{')){
							p1.desempilha();
						}else{
							if(( simbolo == ']')&&(p1.valortopo() == '[')){
								p1.desempilha();
							}else{
								if(( simbolo == ')')&&(p1.valortopo() == '(')){
									p1.desempilha();
								}
							}
						}
					}
				}
			}
		i++;
		}
		if((p1.pilhavazia()&&valido)){
			System.out.println("Expressão Correta ");
		}else{
			System.out.println("Expressão Incorreta ");
			
			entradachar.close();
			entradaint.close();
		}
	}
}
