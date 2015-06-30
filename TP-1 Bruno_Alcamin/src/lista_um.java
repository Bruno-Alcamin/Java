
public class lista_um {
	
	private int elementos[]; 
	int tamanho;
	int p;
	
	lista_um (int tam){
		tamanho = tam;
		elementos = new int [tamanho];
		p=-1;	
	}
	
	public void insere(){

		for(int i=0; i<10; i++) { 
			int x=0;
			x = (int) (1 + Math.random() *10);
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



