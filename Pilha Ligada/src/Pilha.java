
public class Pilha {
	
	private Node topo;
	private int qtde=0;
	
	
	Pilha(){
		topo=null;
	}
	
	public void empilha(int x){
		Node aux =new Node();
		aux.info=x;
		aux.prox=topo;
		topo=aux;
		qtde++;
	}
	
	
	public int desempilha(){
		
		int temp= topo.info;
		
		topo = topo.prox;
		
		qtde--;
		
		return temp;
		
	}

	public boolean PilhaVazia(){
		
		return topo==null;
		
	}
	
	
	public int ElementoTopo(){
		return topo.info;
	}
	
	public Node GetTopo(){
		return topo;
	}
	
	public int GetQtde(){
		return qtde;
	}
}