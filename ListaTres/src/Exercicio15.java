
public class Exercicio15 {

	public static void main(String[] args) {
		int x=2, z=0;
		
		while (x<=100) {
			
			z=x+z;
			
			x+=2;			
		}
		System.out.println(z);
	}

}
