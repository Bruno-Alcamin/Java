
public class Pilha {
	
	private Matriz elementos[];
	private int topo,max;


	Pilha(int tamanho){
		max = tamanho;
		elementos = new Matriz [max];
		topo = -1;
	}
	
	
	public void Empilha(Matriz x){
		topo=topo+1;
		elementos[topo]=x;
	}
	
	
	public Matriz Remove(){
		Matriz temp =elementos[topo];
		topo=topo-1;
		return temp;
		
	}
	
	
	public int getTopo(){
		return topo;
	}
	
	
	public Matriz getpos(int pos){
		return elementos[pos];	
	}
	
}
