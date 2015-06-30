
public class lista_dois {
	
	private int elementos[]; 
	int tamanho;
	int p;
	
	lista_dois (int tam){
		tamanho = tam;
		elementos = new int [tamanho];
		p=-1;	
	}
	
	public void insere(){
		for(int i=0; i<20; i++) { 
			int x=0;
			x = (int) (11 + Math.random() *10);
			p=p+1;
			elementos[p]=x;
		}
	}	
	
	public boolean listacheia(){
		
		if (p==tamanho -1){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean listavazia(){
		
		if (p == -1){
			return true;
		}else{
			return false;
		}
	}
	
	public int getp(){
		return p;
	}
	
	public int getvalor(int pos){
		
		return elementos[pos];
	}

}
