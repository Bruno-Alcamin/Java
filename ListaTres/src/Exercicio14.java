
public class Exercicio14 {

	public static void main(String[] args) {

		int p=1, c=1;
		
		double s=0,k;
		
		while (p<=51) {
			s= s+(1/(Math.pow(c,3)));
			
			p++;
			
			c+=2;
			
		}
		
		k = Math.pow(32*s, 0.3);
		
		System.out.println(k);
		
	}

}
