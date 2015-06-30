import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int opcao, maior=0;
		
		int vetor[] = new int[10]; 

		//menu

		do {

			System.out.println("1 - Carregar Vetor");

			System.out.println("2 - Mostra o Vetor");
			
			System.out.println("3 - Mostra Maior número");
			
			System.out.println("4 - Mostra Menor número");

			System.out.println("9 - Fim");

			System.out.println("Selecione: ");

			opcao = entrada.nextInt();
			
			if (opcao==1){
				System.out.println("1 - Carregar Vetor");
				
				for(int i = 0; i < vetor.length; i++) {  
		            vetor[i] = (int) (1 + Math.random() * 100);
				}
			}else{
				if(opcao==2){
					System.out.println("2 - Mostra o Vetor");
					
					for(int i = 0; i < vetor.length; i++) {  
			            System.out.println(vetor[i]); 
					}
				}else{
					if(opcao==3){
						for (int i=0;i<vetor.length;i++){
							if (vetor[i]>maior){
								maior = vetor[i];
							}
						}
					System.out.println("Maior"+maior);
					}else{
						if(opcao==4){
								for (int i=0;i<vetor.length;i++){
									if (vetor[i]<maior){
										maior = vetor[i];
									}
								}
							System.out.println("Menor"+maior);
							
						}
					}
				}
			}

		} while (opcao!=9);
		entrada.close();
	}

}
