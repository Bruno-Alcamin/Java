import java.util.Scanner;

public class Exercicio03 {
	
	public static void frasedigitada(){
		
		Scanner entradaInt, entradaString;
		
		entradaInt= new Scanner(System.in);
		
		entradaString = new Scanner (System.in);

		int opcao;
		
		String frase =null;	 
		

		//menu

		do {

			

			System.out.println("1 - Entrar com Frase");

			System.out.println("2 - Mostra Total de Caracteres");

			System.out.println("3 - Mostra a frase");

			System.out.println("4 - Mostra frase inversa");

			System.out.println("0 - Fim");

			System.out.println("Selecione: ");

			opcao = entradaInt.nextInt();
		
		
		switch(opcao){
		
		case 1: 
			
			
			System.out.println("Entre com frase");
			
			frase = entradaString.nextLine();
			
			
			
		case 2:
			
			System.out.println("Tamanho: "+frase.length());
			
			break;
			
		case 3:
			
			for (int i =0; i<frase.length();i++){
				
				System.out.println(i+"-"+frase.charAt(i));
			}
			 break;
			 
			 
		case 4:
			
			for (int i =frase.length()-1;i>=0;i--){
				
				System.out.println(i+"-"+frase.charAt(i));
			}
			
		case 5:
			
			System.out.println("Fim");
			
			break;
		}
	}while(opcao==0);	
		
		entradaInt.close();
		entradaString.close();

}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaInt, entradaString;
		
		entradaInt= new Scanner(System.in);
		
		entradaString = new Scanner (System.in);

		int opcao;
		
		String frase =null;	 
		

		//menu

		do {

			

			System.out.println("1 - Entrar com Frase");

			System.out.println("2 - Mostra Total de Caracteres");

			System.out.println("3 - Mostra a frase");

			System.out.println("4 - Mostra frase inversa");

			System.out.println("0 - Fim");

			System.out.println("Selecione: ");

			opcao = entradaInt.nextInt();
			
			if (opcao ==1){
				
				System.out.println("Entre com frase");
				
				frase = entradaString.nextLine();
				
			}else{
				if (opcao ==2){
					System.out.println("Tamanho: "+frase.length());
				}else{
					if(opcao ==3){
						for (int i =0; i<frase.length();i++){
							
							System.out.println(i+"-"+frase.charAt(i));
						}
					}else{
						if(opcao==4){
							for (int i =frase.length()-1;i>=0;i--){
								
								System.out.println(i+"-"+frase.charAt(i));
							}
						}
					}
				}
			}
				
			
		
		}while (opcao != 0);

			System.out.println("Fim !");

			
			
			frasedigitada();
			
			entradaInt.close();
			entradaString.close();
		}
	}
