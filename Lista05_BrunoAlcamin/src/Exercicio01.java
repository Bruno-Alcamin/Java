import java.util.Scanner;


public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int opcao;

		int numero[] = new int [10];

		//menu

		do {

			System.out.println("1 - Carregar Vetor");

			System.out.println("2 - Mostra o Vetor");

			System.out.println("0 - Fim");

			System.out.println("Selecione: ");

			opcao = entrada.nextInt();

			if (opcao==1){
				System.out.println("1 - Carregar Vetor");

				for (int i=0;i<10;i++){

					System.out.println("Digite o valor");

					numero[i]= entrada.nextInt();

				}


			}else{
				if(opcao==2){
					System.out.println("2 - Mostra o Vetor");

					for (int i=0;i<numero.length;i++){
						System.out.println("numero["+i+"]"+numero[i]);
					}

				} 
			}
		}while (opcao != 0);
		
		System.out.println("Fim !");
			entrada.close();
	}
}