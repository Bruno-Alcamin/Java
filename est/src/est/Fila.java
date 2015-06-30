package est;

public class Fila {
	
	private int elementos [];
	private int inic, fim, tamanhoF;
	

	
	Fila(int max){
		tamanhoF = max;
		elementos = new int [tamanhoF];
		inic = 0;
		fim =-1;
	}
	
	public void insere(int x){
		fim++;
		if(fim==tamanhoF){
			fim=0;
		}
		elementos[fim]=x;
	}
	
	
	public int Remove(){
		int temp= elementos[inic];
		inic++;
		if(inic==tamanhoF){
			inic=0;
		}
		
		return temp;
	}
	
	public int getInic(){
		return inic;
	}
	public int getFim(){
		return fim;
	}
	
	public int getTam(){
		return tamanhoF;
	}
	
	public int getpos(int pos){
		return elementos[pos];
	}
	//soma elementos da fila
	public int Soma(){
		int soma =0;
		if(getInic()<getFim()){
			for(int i= getInic();i<=getFim();i++){
				int aux = elementos[i];
				soma = soma+aux;
			}
		}else{
			for(int i= getInic();i<=getTam();i++){
				int aux = elementos[i];
				soma = soma+aux;
			}
			
			for(int i= 0;i<=getFim();i++){
				int aux = elementos[i];
				soma = soma+aux;
			}
		}
		return soma;
	}
	//pesquisa numero
	public boolean pes(int x){
		
		
		boolean temp= false;
		if(inic<=fim){
		for(int i=inic;i<=fim;i++){
			if(x==elementos[i]){
				temp = true;
			}	
		}
		}else{
			for(int i = inic;i<=elementos.length;i++){
				if(x==elementos[i]){
					temp = true;
				}	
			}
			
			for(int i=0;i<=fim;i++){
				if(x==elementos[i]){
					temp = true;
				}	
			}
		}
		return temp;
	}

}
