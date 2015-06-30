
public class Exemplo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v[] = new int[20];
		
		//carregando o vetor
		
		for (int i=0;i<v.length;i++){
		
		int n = (int)(Math.random()*1000);
		
		v[i]=n;
		
		System.out.println("V["+i+"]="+v[i]);
		}

	}

}
