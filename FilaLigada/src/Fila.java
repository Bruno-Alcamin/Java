
public class Fila {

	private Node inic;
	
	private Node fim;
	
	private int qtde=0;
	
	Fila(){
		inic = null;
		fim = null;
	}
	
	public boolean FilaVazia(){
		return inic == null;
	}
	
	
	
	public void Insere(int x){
		
			
		
		
		Node aux = new Node();//alocar
		
		aux.info = x;//guardar informação
			
		aux.prox = null; //ultimo elemento aponto para null
		
		// acertando referencias
		 
		 if(inic == null){
		 	inic = aux; //Passo 1
		 }else{
		 	fim.prox = aux; //Passo 2
		 }
		 fim = aux; // Passo 3
		 
		qtde++;
	}
	
	public int Remove(){
		int temp = inic.info;
		
		inic=inic.prox;
		
		if(inic==null){
			fim=null;
		}
		
		qtde--;
		return temp;
	}
	
	
	public int Primeiro(){
		return inic.info;
	}
	
	public int Ultimo(){
		return fim.info;
	}
	
	
	public Node GetInic(){
		return inic;
	}
	
	public Node GetFim(){
		return fim;
	}
	
	public int GetQtde(){
		return qtde;
	}
	
	public void RemoveTudo(){
		while (inic != null){			
			inic = inic.prox;
			if (inic == null){
				fim = null;
			}
		}
	}

	
}
