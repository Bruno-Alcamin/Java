import java.util.Scanner;


public class Exemplo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int opcao;
		
		int v[] = new int [10];

		//menu

		do {

			System.out.println("1 - Carregar Vetor");

			System.out.println("2 - Mostra o Vetor");

			System.out.println("9 - Fim");

			System.out.println("Selecione: ");

			opcao = entrada.nextInt();
			
			if (opcao==1){
				System.out.println("1 - Carregar Vetor");
				
				for (int i =0; i<v.length;i++){
					v[i] = (int)(Math.random()*100);
				}
				
			}else{
				if(opcao==2){
					System.out.println("2 - Mostra o Vetor");
					for (int i=0;i<v.length;i++){
						System.out.println("v["+i+"]"+v[i]);
					}
					
					
				}	
			}

		} while (opcao!=9);
		entrada.close();
	}

}
