import java.util.Scanner;


public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int opcao;

		String nome[] = new String [10];

		//menu

		do {

			System.out.println("1 - Cadastrar nomes");

			System.out.println("2 - Mostra o Vetor");

			System.out.println("0 - Fim");

			System.out.println("Selecione: ");

			opcao = entrada.nextInt();

			if (opcao==1){
				System.out.println("1 - Cadastrar nomes");

				for (int i=0;i<10;i++){
					
					System.out.println("Qual o nome ?");
					nome[i] = entrada.next ();
				}


			}else{
				if(opcao==2){
					System.out.println("2 - Mostra o Vetor");

					for (int i=0;i<10;i++){
						
						System.out.println(nome[i]);
						
					}

				} 
			}
		}while (opcao != 0);

		System.out.println("Fim !");
		entrada.close();
	}
}
