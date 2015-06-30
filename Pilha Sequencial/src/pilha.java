
public class pilha {
	
	private int elementos[];
	private int topo;
	private int max;
	
	pilha (int tamanho){
		max = tamanho;
		elementos = new int [max];
		topo=-1;
	}
	
	public void empilha(int x){
		topo++;
		elementos[topo]=x;	
	}
	
	public int desempilha(){
		int temp = elementos[topo];
		topo--;
		return temp;
	}
	
	public int valortopo(){
		return  elementos[topo];
	}
	
	public boolean pilhacheia(){
		return topo==max-1;
		}
	
	public boolean pilhavazia(){
		return topo==-1;
	
	}
	
	public int getqtid(){
		return topo+1;
	}
	
	public int gettopo(){
		return topo;
	}
	
	public int getpos(int pos){
		return elementos[pos];	
	}
}
