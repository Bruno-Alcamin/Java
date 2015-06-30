import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int opcao, verif=0,media=0,vmedia=0;

		int vetor1[] = new int[10]; 
		int vetor2[] = new int[10];
		int vetor3[] = new int[10];

		//menu

		do {

			System.out.println("1 - Carregar Primeiro Vetor");

			System.out.println("2 - Carregar Segundo Vetor");
			
			System.out.println("3 - Carregar Terceiro vetor");

			System.out.println("4 - Mostra Vetores");

			System.out.println("5 - Mostra Maior número do vetor 3");
			
			System.out.println("6 - Mostra Menor número do vetor 2");
			
			System.out.println("7 - Mostra Média do vetor 1");

			System.out.println("9 - Fim");

			System.out.println("Selecione: ");

			opcao = entrada.nextInt();

			if (opcao==1){
				System.out.println("1 - Carregar Primeiro Vetor");

				for(int i = 0; i < vetor1.length; i++) {  
					vetor1[i] = (int) (11 + Math.random() *11);
				}
			}else{
				if(opcao==2){
					System.out.println("2 - Carregar Segundo Vetor");

					for(int i = 0; i < vetor2.length; i++) {  
						vetor2[i] = (int) (50 + Math.random() *21);
					}
				}else{
					if(opcao==3){
						for(int i = 0; i < vetor3.length; i++) {

							vetor3[i]=vetor1[i]+vetor2[i];

						}

					}else{
						if(opcao==4){
							System.out.println("4 - Mostra Vetores");

							System.out.println(" ");
							System.out.println("Primeiro Vetor");
							System.out.println(" ");

							for(int i = 0; i < vetor1.length; i++) {

								System.out.println(vetor1[i]); 
							}

							System.out.println(" ");
							System.out.println("Segundo vetor");
							System.out.println(" ");
							for(int i = 0; i < vetor2.length; i++) {  
								System.out.println(vetor2[i]); 
							}

							System.out.println(" ");
							System.out.println("Terceiro Vetor");
							System.out.println(" ");
							for(int i = 0; i < vetor3.length; i++) {  
								System.out.println(vetor3[i]); 
							}
						}else{

							if(opcao==5){
								for (int i=0;i<vetor3.length;i++){
									if (vetor3[i]>verif){
										verif = vetor3[i];
									}
								}
								System.out.println("Maior: "+verif);

							}else{
								if(opcao==6){
									for (int i=0;i<vetor2.length;i++){
										if (vetor2[i]<verif){
											verif = vetor2[i];
										}
									}
									System.out.println("Menor: "+verif);

								}else{
									if(opcao==7){
										for (int i=0;i<vetor1.length;i++){
											media = vetor1[i]+media;
											vmedia= media/10;
											
										}
										System.out.println("Média: "+vmedia);
									}
								}
							}
						}
					}
				}
			}
		

	} while (opcao!=9);
	entrada.close();
}

}
