
public class Pilha {
	
	private int elementos[];
	private int topo,max;
	
	
	Pilha (int tamanho){
		max=tamanho;
		elementos = new int [max];
		topo = -1;
	}
	
	public void Empilha(int x){
		
		topo=topo+1;
		elementos[topo]=x;
		
	}
	
	public int Desempilha(){
		int temp = elementos[topo];
		topo=topo-1;
		return temp;
		
	}
	
	public int GetTopo(){
		return topo;
	}

	
}
