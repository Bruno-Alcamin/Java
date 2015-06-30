
public class pilha {
	
	private Triangulo elementos[];
	private int  max;
	private int topo;
	
	pilha (int tamanho){
		max= tamanho;
		elementos = new Triangulo [max];
		topo=-1;
	}
		
	public void empilha(Triangulo x){
		topo++;
		elementos[topo]=x;	
	}
	
	public Triangulo desempilha(){
		Triangulo temp = elementos[topo];
		topo--;
		return temp;
	}
	
	public Triangulo valortopo(){
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
	
	public Triangulo getpos(int pos){
		return elementos[pos];	
	}
}



