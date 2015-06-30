
public class HashTable {
	
	Node h[]; 

	HashTable(int tam){	
		h = new Node[tam];
		for(int i = 0; i<h.length;i++){
		h[i]= null;
		}
	}
	
	int fht(int x){
		
		return x % h.length;
	}
	

	
	public void insere(int x){
		
		Node aux = new Node();
		
		aux.info=x;
		
		if(h[fht(x)]==null||x<h[fht(x)].info){
			aux.prox=h[fht(x)];
			h[fht(x)]=aux;
		}else{
			Node aux2 = h[fht(x)];
				while((aux2.prox!=null)&&(aux2.prox.info<x)){
						aux2 =aux2.prox;
				}
				aux.prox=aux2.prox;
				aux2.prox=aux;		
		}
	
	}
	
	
	public int Remove(int x){
		Node aux2 = h[fht(x)];
		if(aux2.info ==x){
			h[fht(x)]=aux2.prox;
		}else{
			while(aux2.prox!=null){
				if((aux2.prox.info==x)&&(aux2.prox!=null)){
					aux2.prox=aux2.prox.prox;
					break;
					}
				if(aux2.prox==null){
						aux2=null;
						break;
					}
				aux2 =aux2.prox;
				}	
			}
		return x;
	}
	
	public void MostraLista(){
		for(int i = 0; i<h.length;i++){
			Node aux = h[fht(i)];
			System.out.print("Lista "+i+"=");
			while(aux !=null){
				System.out.print("->"+aux.info);
				aux = aux.prox;
			}
			System.out.print("-> null");
			System.out.println("");
		}
	}

	public boolean Busca(int x){
		boolean temp=false;
		Node aux = h[fht(x)];
		while(aux !=null){
			if(aux.info==x){
				temp = true;
				break;
			}else{
				aux = aux.prox;
			}
		}
		return temp;
	}
	
	public boolean ListaVazia(){
		boolean aux [] = new boolean [h.length];
		boolean temp=true;
		for(int i =0; i<h.length;i++){
			if(h[i]==null){
				aux[i] = true;
				System.out.println("Lista "+i+" : Vazia!");
			}else{
				aux[i]=false;
				System.out.println("Lista "+i+" : Existe elementos!");
			}
			for(int j=0; j<aux.length;j++ ){
				if(aux[i]==false){
					temp = false;
					break;
				}
			}
			
		}
		return temp;
	}
	
	public int VerificaEspalhamento(){
	
		int guarda [] = new int [h.length];
		int c = 0;
		for(int i=0; i<h.length;i++){
			int cont=0;
			Node aux = h[i];
				while(aux!=null){
					cont++;
					aux=aux.prox;
				}
			guarda[i]=cont;
		}
		
		for(int y = 0; y<guarda.length;y++){
			int temp=guarda[y];
			for(int z = 1; z<guarda.length;z++){
				int temp1=guarda[z];
				int ax=temp-temp1;
				if((ax==0)&&(c==0)){
					c=0;
				}else{
					if((ax==1)||(c==1)&&(ax<2)){
						c=1;
					}else{
						c=2;
						break;
					}
				}
			}
			if(c==2){
				break;
			}
		}
		
		return c;
	}	
	
}
