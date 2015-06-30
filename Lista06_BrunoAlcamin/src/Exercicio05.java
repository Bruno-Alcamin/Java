import java.util.Scanner;


public class Exercicio05 {
	
	public static void equacao_segunda(float a,float b,float c){
		
		double delta,x;
		
		delta = Math.pow(b, 2)-4*a*c;
		
		if (delta<0){
			
			System.out.println("Não existe raiz real");
		}else{
			if(delta==0){
				x = -(b)/2*a;
			}else{
				x= (-(b)+(Math.sqrt(delta)))/(2*a);
				
				System.out.println("X1 vale: "+x);
				
				x=(-(b)-(Math.sqrt(delta)))/(2*a);
				
				System.out.println("X2 vale: "+x);
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int a,b,c;
		
		System.out.println("valor de A");
		
		a = entrada.nextInt();
		
		System.out.println("valor de B");
		
		b = entrada.nextInt();

		System.out.println("valor de C");
		
		c = entrada.nextInt();
		
		equacao_segunda(a,b,c);
		
		entrada.close();

	}

}
