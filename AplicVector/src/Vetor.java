import java.util.Vector;


public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector <Integer> v= new Vector<Integer>();
		
		
		v.add(1);
		v.add(6);
		// v.add ("fatec"); não eh  possivel 
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		for(int i=0;i<50;i++){
			v.add( (int) (Math.random()*100)+1);
		}
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		for(int i=0;i<v.size();i++){
			System.out.println(v.get(i));
		}
	}

}
