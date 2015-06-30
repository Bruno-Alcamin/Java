
public class pilha {
	private char elementos[];
	private int topo;
	private int max;
	
	pilha (int tamanho){
		max = tamanho;
		elementos = new char [max];
		topo=-1;
	}
	
	public void empilha(char x){
		topo++;
		elementos[topo]=x;	
	}
	
	public char desempilha(){
		char temp = elementos[topo];
		topo--;
		return temp;
	}
	
	public char valortopo(){
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
	
	public char getpos(int pos){
		return elementos[pos];	
	}
}
