
public class Exemplo04 {

	public static void main(String[] args) {

		String nome = "Fatec Rubens Lara";
		
		System.out.println(nome);
		
		System.out.println("Tamanho: "+nome.length());
		
		for (int i =0; i<nome.length();i++){
			
			System.out.println(i+"-"+nome.charAt(i));
		}
		
		System.out.println(" ");
		//Invertido
		
		for (int i =nome.length()-1;i>=0;i--){
			
			System.out.println(i+"-"+nome.charAt(i));
		}

	}

}
