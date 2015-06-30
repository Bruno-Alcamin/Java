
public class fila {
	
	private int elementos[]; 
	int tamanho, inic, fim, qtde;
	
	
	fila (int tam){
		tamanho = tam;
		elementos = new int [tamanho];
		inic=0;
		fim=-1;
		qtde=0;		
	}
	
	public void insere(int x){
		fim++;
		if(fim==tamanho){
			fim=0;
		}
		elementos[fim]=x;
		qtde++;
	}
	
	public int remove(){
		
		int t=elementos[inic];
		inic++;
		if(inic==tamanho){
			inic=0;
		}
		qtde--;
		return t;
	}
	
	public int primeiro(){
		return elementos[inic];
	}
	
	//Operações auxiliares
	
	public boolean filacheia(){
		return qtde==tamanho;
	}
	
	public boolean filavazia(){
		return qtde==0;
	}
	
	public int getIncio(){
		return inic;
	}
	
	public int getFim(){
		return fim;
	}
	
	public int gerQtde(){
		return qtde;
	}
	
	public int getTamanho(){
		return tamanho;
	}
	
	public int getValor(int posicao){
		return elementos[posicao];
	}
}
