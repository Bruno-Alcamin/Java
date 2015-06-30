
public class DuplaFila extends Fila{
	
	DuplaFila(int tamanho) {
		super(tamanho);
		// TODO Auto-generated constructor stub
	}

	public void InsereInic(int x){
		inic--;
		if (inic == -1){
			inic=tamanho-1;
		}
		elementos[inic]=x;
		qtde++;
	}
	
	public int RemoveFim(){
		
		int t=elementos[fim];
		fim--;
		if(fim == -1){
			fim= tamanho-1;
		}
		qtde--;
		return t;
		
	}
	
	public int Ultimofila(){
		return elementos[fim];
	}

}
