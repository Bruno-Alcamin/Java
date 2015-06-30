
public class Exercicio02 {
	
	public static void numeros_de_1_a_100_for (){
		
		for (int x=1;x<=100;x++){
			System.out.println(x);
		}
			
	}
	public static void numeros_de_1_a_100_do(){
			
		int i=1;
			
		do{
				
			System.out.println(i);
			
			i++;
				
		}while(i<=100);
			
	}
	
	public static void numeros_de_1_a_100_while(){
		
		int x=1;
		
		while (x<=100){
			
			System.out.println(x);
			
			x++;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numeros_de_1_a_100_for();
		
		System.out.println("  ");
		
		numeros_de_1_a_100_do();
		
		System.out.println("  ");
		
		numeros_de_1_a_100_while();

	}

}
